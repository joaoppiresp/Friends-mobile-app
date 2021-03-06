package pt.iade.friends.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.friends.models.InfoSpot;
import pt.iade.friends.models.repositories.InfoSpotRepository;
import pt.iade.friends.models.Views.InfoSpotView;
import pt.iade.friends.models.Views.InfoSpotView2;
import pt.iade.friends.models.Views.InfoSpotView3;

@RestController
@RequestMapping(path = "/api/spots")
public class InfoSpotController{
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
    //working
    //geting spot info for search view
    @GetMapping(path = "/searchinfos/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<InfoSpotView2> getInfos(@PathVariable String name){
        logger.info("sending info for spot with name "+name);
        return infoSpotRepository.getSpotInfo(name);
    }
    //
    //get spot info for markers
    @GetMapping(path="/markers/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<InfoSpotView3> makeMarkers(@PathVariable String name){
        logger.info("sending info for marker building"+name);
        return infoSpotRepository.getInfoMarker(name);
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


