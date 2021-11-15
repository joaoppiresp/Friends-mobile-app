package pt.iade.friends.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.repositories.FriendsRepository;
import pt.iade.friends.models.friends;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/friends")
public class FriendsController {

    private Logger logger = LoggerFactory.getLogger(FriendGroupController.class);
    @Autowired
    private FriendsRepository friendsRepository;

    // get all friends
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<friends> getAllFriends() {
        logger.info("Sending all friends");
        return friendsRepository.findAll();
    }

    // get a friend by id
    @GetMapping(path = "{frnd_user_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public friends getFriendById(@PathVariable int frnd_user_id) {
        logger.info("Sending friend info with id " + frnd_user_id);
        Optional<friends> _friends = friendsRepository.findById(frnd_user_id);
        if (_friends.isPresent())
            return _friends.get();
        else
            throw new NotFoundException("" + frnd_user_id, "friends", "frnd_user_id");
    }

    // TODO: adding a new friend method goes here
    // TODO: deleting a friend method goes here
}

/*
 * the method to add a new friend needs to be design in a way that it waits for
 * the response of the other user to add him to the friend's list
 */
