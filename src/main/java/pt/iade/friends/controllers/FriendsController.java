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
import pt.iade.friends.models.Friends;
import pt.iade.friends.models.repositories.FriendsRepository;
import pt.iade.friends.models.responses.Response;

@RestController
@RequestMapping(path = "/api/friends")
public class FriendsController 
{
    private Logger logger = LoggerFactory.getLogger(FriendsController.class);
    @Autowired
    private FriendsRepository friendsRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    // get all friends
    public Iterable <Friends> getFriends() {
        logger.info("Sending all Friends");
        return friendsRepository.findAll();
    }

    // get user by frndUserId
    @GetMapping(path = "/{frndUserId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Friends getFriends(@PathVariable ("frndUserId") int frndUserId) {
        logger.info("Sending users with id " + frndUserId);
        Optional <Friends> _friends=friendsRepository.findById(frndUserId);
        if(!_friends.isPresent()) throw 
        new NotFoundException(""+frndUserId,"users", "id");
        else return _friends.get();
    }

    // save friends
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Friends addFriends(@RequestBody Friends friends) {
        Friends saveFriends = friendsRepository.save(friends);
        logger.info("Saving friends with id"+saveFriends.getFrndUserId());
        return saveFriends;
    }

    // delete friends
    @DeleteMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteUsers(@PathVariable int frndUserId) {
        logger.info("Deleted user with id "+frndUserId);
        friendsRepository.deleteById(frndUserId);
        return new Response("Deleted friend with id "+frndUserId, null);
    }

}

