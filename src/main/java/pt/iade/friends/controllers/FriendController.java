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
import pt.iade.friends.models.Friend;
import pt.iade.friends.models.Views.FriendView;
import pt.iade.friends.models.repositories.FriendRepository;
import pt.iade.friends.models.responses.Response;

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
        logger.info(" Sending all Friends ");
        return friendRepository.findAll();
    }

    // get friend by id
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Friend getFriend(@PathVariable(value="id") int id) 
    {
        logger.info(" Sending friends with id " + id);
        Optional <Friend> _friend=friendRepository.findById(id);
        if(!_friend.isPresent()) throw 
        new NotFoundException("  "+id," friend ", " id ");
        else return _friend.get();
    }

        // save friend
        @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
        public Friend saveFriend(@RequestBody Friend friend) 
        {
            Friend saveFriend = friendRepository.save(friend);
            logger.info(" Saving friend with id "+saveFriend.senderId+saveFriend.receiverId+saveFriend.dateTime+saveFriend.status);
            return saveFriend;
        }
    
        // delete friend
        @DeleteMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
        public Response deleteFriend(@PathVariable(value="id") int id) 
        {
            logger.info(" Deleted user with id "+id);
            friendRepository.deleteById(id);
            return new Response(" Deleted friend with id "+id, null);
        }

        // friends by sender id
        @GetMapping(path = "/senderid/{senderId:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
        public Iterable<FriendView> getNmFriendbyS(@PathVariable int senderId)
        {
            logger.info("Sending all friend for sender with id");
            return friendRepository.filtersenderId(senderId);
        }
}
    
    