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
import pt.iade.friends.models.Views.UserInterestView;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.repositories.UserInterestRepository;

@RestController
@RequestMapping(path = "/api/userinterests")
public class UserInterestController 
{
    private Logger logger = LoggerFactory.getLogger(UserInterestController.class);
    @Autowired
    private UserInterestRepository userInterestRepository;

    @GetMapping(path = "/id/{intFk:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<UserInterestView> getUserInterestbyId(@PathVariable int intFk)
    {
        logger.info(" Sending all user interest " +intFk);
        return userInterestRepository.filterUserInterest(intFk);
    }

    // get user by Id
    @GetMapping(path ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserInterest getUser(@PathVariable(value ="id") int id) 
    {
        logger.info("Sending User with id" +id);
        Optional <UserInterest> _user=userInterestRepository.findById(id);
        if(!_user.isPresent()) throw 
        new NotFoundException("" +id,"UserInterest","id");
        else return _user.get();
    }
}
