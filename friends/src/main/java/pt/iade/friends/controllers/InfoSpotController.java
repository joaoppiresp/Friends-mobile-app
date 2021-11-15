package pt.iade.friends.controllers;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.InfoSpot;
import pt.iade.friends.models.repositories.InfoSpotRepository;

@RestController
@RequestMapping(path = "/api/infospots")
public class InfoSpotController 
{
    private Logger logger = LoggerFactory.getLogger(InfoSpotController.class);
    @Autowired
    private InfoSpotRepository infospotRepository;

    // get all spots
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<InfoSpot> getInfoSpots() 
    {
        logger.info("Sending all infospots");
        return infospotRepository.findAll();
    }

    // get spot by id
    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public InfoSpot getInfoSpotById(@PathVariable int id) 
    {
        logger.info("Sending all infospots");
        Optional<InfoSpot> _infospot = infospotRepository.findById(id);
        if (_infospot.isPresent())
            return _infospot.get();
        else
            throw new NotFoundException("" + id, "infospots", "id");

    }

    // add a new spot
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public InfoSpot saveInfoSpot(@RequestBody InfoSpot infospot) 
    {
        logger.info("Saving infospot with name: " + infospot.getSpot_Name());
        InfoSpot newInfoSpot = infospotRepository.save(infospot);
        return newInfoSpot;

    }

    // delete a spot
    
}
