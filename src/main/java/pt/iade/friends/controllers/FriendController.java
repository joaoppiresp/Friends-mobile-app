package pt.iade.friends.controllers;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.Friend;
import pt.iade.friends.models.repositories.FriendRepository;

@RestController
@RequestMapping(path = "/api/friends")
public class FriendController 
{
    private Logger logger = LoggerFactory.getLogger(FriendController.class);
    @Autowired
    private FriendRepository friendRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    // get all friends
    public Iterable <Friend> getFriend() 
    {
        logger.info("Sending all Friends");
        return friendRepository.findAll();
    }

    // get friend by frndUserId
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Friend getFriends(@PathVariable(value="id") int id) 
    {
        logger.info("Sending users with id " + id);
        Optional <Friend> _friend=friendRepository.findById(id);
        if(!_friend.isPresent()) throw 
        new NotFoundException(""+id,"friend", "id");
        else return _friend.get();
    }

    // save friends
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Friend addFriend(@RequestBody Friend friend) 
    {
        Friend saveFriend = friendRepository.save(friend);
        logger.info("Saving friends with id"+saveFriend.getFrndUserId());
        return saveFriend;
    }
}