package pt.iade.friends.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.repositories.EventTypeRepository;
import pt.iade.friends.models.EventType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/eventtypes")
public class EventTypeController {

    private Logger logger = LoggerFactory.getLogger(EventTypeController.class);
    @Autowired
    private EventTypeRepository eventTypeRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<EventType> getAllEventTypes() {
        logger.info("Sending all eventtypes");
        return eventTypeRepository.findAll();
    }

    @GetMapping(path = "{evnt_type_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public EventType getEventTypeById(@PathVariable int evnt_type_id) {
        logger.info("Sending eventtype info with id " + evnt_type_id);
        Optional<EventType> _eventtype = eventTypeRepository.findById(evnt_type_id);
        if (_eventtype.isPresent())
            return _eventtype.get();
        else
            throw new NotFoundException("" + evnt_type_id, "eventtype", "evnt_type_id");
    }
}
