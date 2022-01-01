package pt.iade.friends.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.iade.friends.models.UserInterest;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.repositories.UserInterestRepository;

@RestController
@RequestMapping(path = "/api/userinterest")
public class UserInterestController 
{
    private Logger logger = LoggerFactory.getLogger(UserInterestController.class);
    @Autowired
    private UserInterestRepository userInterestRepository;

    // get all user interest
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<UserInterest> getUserInterest()
    {
        logger.info("sending all User Interest");
        return userInterestRepository.findAll();
    }

    // get user interest by Id
    @GetMapping(path ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserInterest getUser(@PathVariable(value ="id") int id) 
    {
        logger.info("Sending User with id" +id);
        Optional <UserInterest> _userInterest=userInterestRepository.findById(id);
        if(!_userInterest.isPresent()) throw 
        new NotFoundException("" +id,"UserInterest","id");
        else return _userInterest.get();
    }
}
