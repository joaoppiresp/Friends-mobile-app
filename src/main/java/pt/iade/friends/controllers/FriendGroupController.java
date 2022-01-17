package pt.iade.friends.controllers;

import javax.persistence.Version;

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
    //working
    // get group by id
    @GetMapping(path = "/owners/{owner}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<FriendGroupView> getGroupsByOwner(@PathVariable int owner){

        logger.info("Sending all groups for user with id "+owner);
        return friendgroupRepository.filterbyOwner(owner);

    }

    //save Group
    @PostMapping(path = "/1/newgroups", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response saveFriendGroup(@PathVariable int owner, @RequestBody String gpname,@RequestBody int friends, @RequestBody String friendship) 
    {
        logger.info(" Saving friendgroup for user "+ owner);
        Integer inserted = friendgroupRepository.saveGroup(gpname,friends,friendship);
        return new Response("new group created", inserted);
    }
    
    @PostMapping(path ="/create", produces = MediaType.APPLICATION_JSON_VALUE)
        public FriendGroup saveFGroup(@RequestBody FriendGroup friendGroup) 
        {
        
            return friendgroupRepository.save(friendGroup);
    
        }
   


    // delete Group
    @DeleteMapping(path = "/delete/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteFriendGroup(@PathVariable(value="id") int id) 
    {
        logger.info(" Deleted Group with id "+id);
        friendgroupRepository.deleteById(id);
        return new Response(" Deleted Group with id "+id, null);
    }
}
