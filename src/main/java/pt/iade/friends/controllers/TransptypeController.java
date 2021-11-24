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
import pt.iade.friends.models.Transptype;
import pt.iade.friends.models.repositories.TransptypeRepository;

@RestController
@RequestMapping(path = "/api/transptype")
public class TransptypeController 
{
    private Logger logger = LoggerFactory.getLogger(TransptypeController.class);
    @Autowired
    private TransptypeRepository transptypeRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    // get all users
    public Iterable <Transptype> getTransptype() 
    {
        logger.info(" Sending all Transptype ");
        return transptypeRepository.findAll();
    }

    // get user by id
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Transptype getTransptype(@PathVariable(value="id") int id) 
    {
        logger.info(" Sending Transptype with id " + id);
        Optional <Transptype> _transptype=transptypeRepository.findById(id);
        if(!_transptype.isPresent()) throw 
        new NotFoundException("  "+id," Transptype ", " id ");
        else return _transptype.get();
    }
}