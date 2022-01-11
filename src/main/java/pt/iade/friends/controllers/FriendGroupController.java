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
import pt.iade.friends.models.FriendGroup;
import pt.iade.friends.models.Views.FriendGroupView;
import pt.iade.friends.models.repositories.FriendGroupRepository;
import pt.iade.friends.models.responses.Response;

@RestController
@RequestMapping(path = "/api/friendgroups")
public class FriendGroupController 
{
    private Logger logger = LoggerFactory.getLogger(FriendGroupController.class);
    @Autowired
    private FriendGroupRepository friendgroupRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    // get all group
    public Iterable <FriendGroup> getFriendGroups() 
    {
        logger.info(" Sending all Friend Groups ");
        return friendgroupRepository.findAll();
    }

    // get group by id
    @GetMapping(path = "/owners/{ownerId:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<FriendGroupView> getGroupsByOwner(@PathVariable int ownerId){

        logger.info("Sending all groups for user with id "+ownerId);
        return friendgroupRepository.filterbyOwner(ownerId);

    }

    /*
    // save Group
    @PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public FriendGroup saveFriendGroup(@RequestBody FriendGroup friendGroup) 
    {
        FriendGroup savedFriendGroup = friendgroupRepository.save(friendGroup);
        logger.info(" Saving user with id "+ savedFriendGroup.friendgroupId);
       return savedFriendGroup;
    }
    */
   
    // delete Group
    @DeleteMapping(path = "/delete/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteFriendGroup(@PathVariable(value="id") int id) 
    {
        logger.info(" Deleted Group with id "+id);
        friendgroupRepository.deleteById(id);
        return new Response(" Deleted Group with id "+id, null);
    }
}