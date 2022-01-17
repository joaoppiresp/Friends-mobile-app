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
import org.springframework.web.bind.annotation.RequestParam;
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

    //checking friend requests made
    @GetMapping(path = "/senderid/{senderId:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<FriendView> filterRequests(@PathVariable int senderId)
    {
        logger.info("Sending all friend for sender with id");
        return friendRepository.filtersenderId(senderId);
    }

    //working
    // friends by sender id
    @GetMapping(path = "/senderid/{senderId:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<FriendView> getNmFriendbyS(@PathVariable int senderId)
    {
        logger.info("Sending all friend for sender with id");
        return friendRepository.filtersenderId(senderId);
    }
    //working
    // sending friend request
    @PostMapping(path = "/requestingfriends", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response friendRequest(@RequestParam String status,@RequestParam int senderId,@RequestParam int receiverId,@RequestParam int actionTakerId)
    {
        Integer inserted = friendRepository.friendRequest(status,senderId,receiverId,actionTakerId);
        return new Response("new friend request", inserted);
    }
    //working
    // accepting friend request
    @PostMapping(path = "/acceptingfriends", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response acceptingRequests(@RequestParam String status,@RequestParam int senderId,@RequestParam int receiverId,@RequestParam int actionTakerId)
    {
        Integer inserted = friendRepository.friendRequest(status,senderId,receiverId,actionTakerId);
        return new Response("new friend accepted", inserted);
    }

    
    
    // delete friend
    @DeleteMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteFriend(@PathVariable(value="id") int id) 
    {
        logger.info(" Deleted user with id "+id);
        friendRepository.deleteById(id);
        return new Response(" Deleted friend with id "+id, null);
    }

}
    
    