package pt.iade.friends.controllers;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.exceptions.NotFoundException2;
import pt.iade.friends.models.User;
import pt.iade.friends.models.repositories.UserRepository;
import pt.iade.friends.models.responses.Response;

@RestController
@RequestMapping(path = "/api/users")
public class UserController 
{
    private Logger logger = LoggerFactory.getLogger(InterestController.class);
    @Autowired
    private UserRepository userRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    // get all users
    public Iterable <User> getUser() 
    {
        logger.info(" Sending all Users ");
        return userRepository.findAll();
    }

    // get user by Id
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable(value="id") int id) 
    {
        logger.info(" Sending User with id " + id);
        Optional <User> _user=userRepository.findById(id);
        if(!_user.isPresent()) throw 
        new NotFoundException("  "+id," User ", " id ");
        else return _user.get();
    }

    // get user by Username
    @GetMapping(path = "/getUsernameById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUsernameById(@PathVariable("id") int id)
    {
        logger.info("Sending user with id: " + id);
        Optional<User> _user = userRepository.findById(id);
        if(!_user.isPresent())throw
        new NotFoundException("" + id, "Utilizador", "");
        else return _user.get().getNm();
    }

    // save User
        @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
        public User saveUser(@RequestBody User user) 
        {
            User saveUser = userRepository.save(user);
        logger.info(" Saving user with id "+saveUser.getId());
        return saveUser;
        }
    
    // delete User
        @DeleteMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
        public Response deleteUser(@PathVariable(value="id") int id) 
        {
            logger.info(" Deleted User with id "+id);
            userRepository.deleteById(id);
            return new Response(" Deleted User with id "+id, null);
        }
}