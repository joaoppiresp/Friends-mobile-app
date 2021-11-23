package pt.iade.friends.controllers;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.friends.models.Eventtype;
import pt.iade.friends.models.repositories.EventtypeRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pt.iade.friends.models.exceptions.NotFoundException;

@RestController
@RequestMapping(path = "/api/evtypes")
public class EventtypeController {
    private Logger logger = LoggerFactory.getLogger(EventtypeController.class);
    @Autowired
    private EventtypeRepository eventTypeRepository;
    
    // get all event types available
    @GetMapping(path = "/events", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Eventtype> getEvents() 
    {
        logger.info("showing all event types available");
        return eventTypeRepository.findAll();
    }
     // get evnt types by id
     @GetMapping(path= "/{evntId:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
     public Eventtype getEventsId(@PathVariable(value = "evntId") int evntId) throws NotFoundException
     {
        logger.info("showing event types with id "+evntId);
        Optional<Eventtype> _eventtype = eventTypeRepository.findById(evntId);
        if (!_eventtype.isPresent()) throw new NotFoundException(""+evntId, "Eventtype", "evntId");
        else return _eventtype.get();
     }
}