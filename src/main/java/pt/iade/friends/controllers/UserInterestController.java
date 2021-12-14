package pt.iade.friends.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pt.iade.friends.models.Views.UserInterestView;
import pt.iade.friends.models.repositories.UserInterestRepository;

@RestController
@RequestMapping(path = "/api/userinterest")
public class UserInterestController 
{
    private Logger logger = LoggerFactory.getLogger(UserInterestController.class);
    @Autowired
    private UserInterestRepository userInterestRepository;

    @GetMapping(path = "/usersid/{usersFk:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<UserInterestView> getUserInterestbyId(@PathVariable int usersFk)
    {
        logger.info(" Sending all user interest " +usersFk);
        return userInterestRepository.filteruserInterestUser(usersFk);
    }
}
