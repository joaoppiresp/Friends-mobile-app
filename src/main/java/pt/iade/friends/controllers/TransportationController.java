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
import pt.iade.friends.models.Transportation;
import pt.iade.friends.models.repositories.TransportationRepository;

@RestController
@RequestMapping(path = "/api/transportation")
public class TransportationController 
{
    private Logger logger = LoggerFactory.getLogger(TransportationController.class);
    @Autowired
    private TransportationRepository transportationRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    // get all users
    public Iterable <Transportation> getTransportation() 
    {
        logger.info(" Sending all Transportation ");
        return transportationRepository.findAll();
    }

    // get user by id
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Transportation getFriendGroup(@PathVariable(value="id") int id) 
    {
        logger.info(" Sending Transportation with id " + id);
        Optional <Transportation> _transportation=transportationRepository.findById(id);
        if(!_transportation.isPresent()) throw 
        new NotFoundException("  "+id," Transportation ", " id ");
        else return _transportation.get();
    }
}