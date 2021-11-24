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
import pt.iade.friends.models.UserInterest;
import pt.iade.friends.models.repositories.UserInterestRepository;

@RestController
@RequestMapping(path = "/api/usersinterests")
public class UserInterestController 
{
    private Logger logger = LoggerFactory.getLogger(UserInterestController.class);
    @Autowired
    private UserInterestRepository userinterestRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    // get all users
    public Iterable <UserInterest> getUserInterests() 
    {
        logger.info("Sending all User Interests");
        return userinterestRepository.findAll();
    }

    // get user by id
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserInterest getUser(@PathVariable(value="id") int id) 
    {
        logger.info("Sending user with id " + id);
        Optional <UserInterest> _userinterest=userinterestRepository.findById(id);
        if(!_userinterest.isPresent()) throw 
        new NotFoundException(""+id,"user interest", "id");
        else return _userinterest.get();
    }
}
