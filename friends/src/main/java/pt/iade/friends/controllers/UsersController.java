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
import pt.iade.friends.models.Users;
import pt.iade.friends.models.repositories.UsersRepository;
import pt.iade.friends.models.responses.Response;
@RestController
@RequestMapping(path = "/api/users")
public class UsersController 
{
    private Logger logger = LoggerFactory.getLogger(UsersController.class);
    @Autowired
    private UsersRepository usersRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    public Iterable <Users> getusers() 
    {
        logger.info("Sending all Users");
        return usersRepository.findAll();
    }

    @GetMapping(path = "{internal_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    
    public Users getUsersById(@PathVariable int internal_id)
    {
        logger.info("Sending all users");
        Optional<Users> _users = usersRepository.findById(internal_id);
        if(_users.isPresent()) return _users.get();
        else
        throw new NotFoundException(""+ internal_id, "users", "internal_id"); 
        
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Users saveUsers(@RequestBody Users spot)
    {
        logger.info("Saving Users with name: "+Users.class.getName());
        Users newUsers = usersRepository.save(spot);
        return newUsers;
    }

    @DeleteMapping(path = "{internal_id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteUsersById(@PathVariable int internal_id)
    {
        logger.info("delete Users with internal_id: "+internal_id);
        if(usersRepository.deleteUsersById(internal_id))
        return new Response(internal_id+ "was deleted.", null);
        else return new Response(internal_id+ "not found.", null);
    }


}

