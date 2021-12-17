package pt.iade.friends.controllers;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.InfoSpot;
import pt.iade.friends.models.repositories.InfoSpotRepository;
import pt.iade.friends.models.Views.InfoSpotView;
import pt.iade.friends.models.Views.InfoSpotView2;

@RestController
@RequestMapping(path = "/api/spots")
public class InfoSpotController 
{
    private Logger logger = LoggerFactory.getLogger(InfoSpotController.class);
    @Autowired
    private InfoSpotRepository infoSpotRepository;
    //working
    //getting Identifiers
    @GetMapping(path = "/idents/{spotId:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<InfoSpotView> getIdentifiers(@PathVariable int spotId){
        logger.info("sending indentifiers for all spots");
        return infoSpotRepository.getAllIdentifiers(spotId);
    }

    //geting spot info for search view
    @GetMapping(path = "/searchinfos/{spotId:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<InfoSpotView2> getInfos(@PathVariable int spotId){
        logger.info("sending info for spot with id "+spotId);
        return infoSpotRepository.getSpotInfo(spotId);
    }
    //working
    // get all spots
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<InfoSpot> getSpots() 
    {
        logger.info("Sending all spots");
        return infoSpotRepository.findAll();
    }
}

/*
// get spot by id
    @GetMapping(path= "/{spotId:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public InfoSpot getSpot(@PathVariable(value="spotId") int spotId) throws NotFoundException
    {
        logger.info("Sending spot"+spotId);
        Optional<InfoSpot> _infospot = infoSpotRepository.findById(spotId);
        if (!_infospot.isPresent()) throw new NotFoundException(""+spotId, "InfoSpot", "spotId");
        else return _infospot.get();
          
    }

*/

