package pt.iade.friends.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.repositories.FriendGroupRepository;
import pt.iade.friends.models.friendgroup;
import pt.iade.friends.models.friends;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Optional;
import pt.iade.friends.models.responses.Response;

@RestController
@RequestMapping(path = "/api/friendgroups")
public class FriendGroupController {

    private Logger logger = LoggerFactory.getLogger(FriendGroupController.class);
    @Autowired
    private FriendGroupRepository friendGroupRepository;

    // get all groups
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<friendgroup> getAllFriendGroups() {
        logger.info("Sending all friendgroups");
        return friendGroupRepository.findAll();
    }

    // get a group by id
    @GetMapping(path = "{group_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public friendgroup getFriendGroupById(@PathVariable int group_id) {
        logger.info("Sending group info with id " + group_id);
        Optional<friendgroup> _friendgroup = friendGroupRepository.findById(group_id);
        if (_friendgroup.isPresent())
            return _friendgroup.get();
        else
            throw new NotFoundException("" + group_id, "friendgroup", "group_id");
    }

    // creating a group
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public friendgroup saveFriendgroup(@RequestBody friendgroup friendgroup) {
        friendgroup newfriendgroup = friendGroupRepository.saveFriendgroup(friendgroup);
        logger.info("saving the group with the name: " + newfriendgroup.getGroup_Name());
        return newfriendgroup;
    }

    // adding a friend to a group
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public int saveFriendInGroup(@PathVariable int group_id, @RequestBody friends friends) {
        logger.info("adding a friend" + " (id: " + friends.getFrnd_User_Id() + ")" + "to the group " + group_id);
        return friendGroupRepository.saveFriendInGroup(group_id, friends);
    }

    // deleting a group by id
    @DeleteMapping(path = "{group_id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteFriendGroup(@PathVariable int group_id) {
        logger.info("deleting friend group" + " (id: " + group_id + ")");
        if (friendGroupRepository.deleteFriendGroup(group_id))
            return new Response(group_id + " was deleted", null);
        else
            return new Response(group_id + " was not deleted", null);
    }

    // deleting a friend by id
    @DeleteMapping(path = "{group_id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteFriendFromGroup(@PathVariable int group_id, @RequestBody int friends_id) {
        logger.info("deleting friend " + "(id: " + friends_id + ")" + " from group " + group_id);
        if (friendGroupRepository.deleteFriendFromGroup(friends_id))
            return new Response(friends_id + " was deleted from the group", null);
        else
            return new Response(friends_id + " was not deleted", null);
    }

}
// TODO : the error is the same between the methods;

/*
 * Another interesting methods could be to find a friend byt name inside the
 * friend group; this could be useful if a group has a lot of friends i.e.;
 */