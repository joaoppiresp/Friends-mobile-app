package pt.iade.friends.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import pt.iade.friends.views.EventView;
import pt.iade.friends.models.repositories.InfoSpotRepository;

public class SpotEventController {
    
    private Logger logger = LoggerFactory.getLogger(SpotEventController.class);
    @Autowired
    private InfoSpotRepository infoSpotRepository;

    @GetMapping(path= "/events/", produces = MediaType.APPLICATION.JSON.VALUE)
    public Iterable<EventView> getEvents(){
        logger.info("Sending all events");
        return infoSpotRepository.findAll();
    }

}
