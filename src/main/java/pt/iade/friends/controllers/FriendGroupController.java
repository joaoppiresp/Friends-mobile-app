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
import pt.iade.friends.models.FriendGroup;
import pt.iade.friends.models.repositories.FriendGroupRepository;

@RestController
@RequestMapping(path = "/api/friendgroup")
public class FriendGroupController 
{
    private Logger logger = LoggerFactory.getLogger(FriendGroupController.class);
    @Autowired
    private FriendGroupRepository friendgroupRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    // get all users
    public Iterable <FriendGroup> getFriendGroups() 
    {
        logger.info("Sending all Friend Groups");
        return friendgroupRepository.findAll();
    }

    // get user by id
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public FriendGroup getFriendGroup(@PathVariable(value="id") int id) 
    {
        logger.info("Sending user with id " + id);
        Optional <FriendGroup> _friendgroup=friendgroupRepository.findById(id);
        if(!_friendgroup.isPresent()) throw 
        new NotFoundException(""+id,"friend group", "id");
        else return _friendgroup.get();
    }
}