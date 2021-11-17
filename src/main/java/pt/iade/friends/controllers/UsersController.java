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

    // get all users
    public Iterable <Users> getUsers() {
        logger.info("Sending all Users");
        return usersRepository.findAll();
    }

    // get user by id
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Users getUsers(@PathVariable ("id") int id) {
        logger.info("Sending users with id " + id);
        Optional <Users> _users=usersRepository.findById(id);
        if(!_users.isPresent()) throw 
        new NotFoundException2(""+id,"users", "id");
        else return _users.get();
    }

    // save user
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Users saveUsers(@RequestBody Users users) {
        Users saveUsers = usersRepository.save(users);
    logger.info("Saving user with id"+saveUsers.getId());
    return saveUsers;
    }

    // delete user
    @DeleteMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteUsers(@PathVariable int id) {
        logger.info("Deleted user with id "+id);
        usersRepository.deleteById(id);
        return new Response("Deleted user with id "+id, null);
    }

}

