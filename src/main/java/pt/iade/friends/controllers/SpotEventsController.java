package pt.iade.friends.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.friends.models.repositories.SpotEventsRepository;
import pt.iade.friends.models.SpotEvents;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(path = "/api/events")
public class SpotEventsController {

    private Logger logger = LoggerFactory.getLogger(SpotEventsController.class);
    @Autowired
    private SpotEventsRepository spotEventsRepository;
    
    // get all events from all spots
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvents> getAllEvnts() 
    {
        logger.info("Sending all events");
        return spotEventsRepository.findAll();
    }
}
