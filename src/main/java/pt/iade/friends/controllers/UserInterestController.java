package pt.iade.friends.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.iade.friends.models.UserInterest;
import pt.iade.friends.models.Views.UserInterestView;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.repositories.UserInterestRepository;
import pt.iade.friends.models.responses.Response;

@RestController
@RequestMapping(path = "/api/userinterests")
public class UserInterestController 
{
    private Logger logger = LoggerFactory.getLogger(UserInterestController.class);
    @Autowired
    private UserInterestRepository userInterestRepository;

    // get all user interest
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<UserInterest> getUserInterest()
    {
        logger.info("sending all User Interest");
        return userInterestRepository.findAll();
    }

    // get user interest by Id
    @GetMapping(path ="/{usersFk}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserInterest getUser(@PathVariable(value ="usersFk") int usersFk) 
    {
        logger.info("Sending User Interest with id" +usersFk);
        Optional <UserInterest> _userInterest=userInterestRepository.findByUser(usersFk);
        if(!_userInterest.isPresent()) throw 
        new NotFoundException("" +usersFk,"UserInterest","id");
        else return _userInterest.get();
    }

     // save User Ineterest
     @PostMapping(path ="/create", produces = MediaType.APPLICATION_JSON_VALUE)
     public UserInterest saveUserInterest(@RequestBody UserInterest userInterest) 
     {
        UserInterest savedUserInterest = userInterestRepository.save(userInterest);
     logger.info("Saving User Interest with id" + savedUserInterest.getInteId());
     return savedUserInterest;
     }
 
 // delete User
     @DeleteMapping(path ="/delete/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
     public Response deleteUserInterest(@PathVariable(value ="id") int id) 
     {
         logger.info("Deleted User Interest with id"+id);
         userInterestRepository.deleteById(id);
         return new Response("Deleted User Interest with id" +id, null);
     }

     // get interest user  name and id
     @GetMapping(path = "/usersfk/{usersFk:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
        public Iterable<UserInterestView> getIntUserNmandId(@PathVariable int usersFk)
        {
            logger.info("Sending all user interest for user with id");
            return userInterestRepository.filterNm(usersFk);
        }


}
