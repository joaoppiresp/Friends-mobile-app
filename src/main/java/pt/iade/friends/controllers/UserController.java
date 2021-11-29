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
import pt.iade.friends.models.User;
import pt.iade.friends.models.repositories.UserRepository;

@RestController
@RequestMapping(path = "/api/users")
public class UserController 
{
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserRepository userRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    // get all users
    public Iterable <User> getUsers() 
    {
        logger.info(" Sending all Users ");
        return userRepository.findAll();
    }

    // get user by id
    @GetMapping(path = "/{userId:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable(value="userId") int userId) throws NotFoundException 
    {
        logger.info(" Sending user with id " + userId);
        Optional <User> _user=userRepository.findById(userId);
        if(!_user.isPresent()) throw new NotFoundException("  "+userId," user ", " userId ");
        else return _user.get();
    }
}