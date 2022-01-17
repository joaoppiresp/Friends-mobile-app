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
import org.springframework.web.bind.annotation.RequestParam;
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
    //working
    //save Group
    @PostMapping(path = "/newgroups", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response saveFriendGroup(@RequestParam String gpname,@RequestParam int owner,@RequestParam int friends, @RequestParam String friendship) 
    {
        Integer inserted = friendgroupRepository.saveGroup(gpname,owner,friends,friendship);
        return new Response("new group created", inserted);
    }
    
    // delete Group
    @PostMapping(path = "/deletegroups", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteFriendGroup(@RequestParam String gpname,@RequestParam int owner) 
    {
        Integer deleted = friendgroupRepository.deleteGroup(gpname,owner);
        return new Response("group deleted", deleted);
    }
}
