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
import pt.iade.friends.models.User;
import pt.iade.friends.models.repositories.UserRepository;
import pt.iade.friends.models.responses.Response;

@RestController
@RequestMapping(path = "/api/users")
public class UserController 
{
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserRepository userRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    // get all users
    public Iterable <User> getUser() 
    {
        logger.info("Sending all Users");
        return userRepository.findAll();
    }

    // get user by Id
    @GetMapping(path ="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable(value ="id") int id) 
    {
        logger.info("Sending User with id" +id);
        Optional <User> _user=userRepository.findById(id);
        if(!_user.isPresent()) throw 
        new NotFoundException("" +id,"User","id");
        else return _user.get();
    }

    // save User
        @PostMapping(path ="/create", produces = MediaType.APPLICATION_JSON_VALUE)
        public User saveUser(@RequestBody User user) 
        {
            User savedUser = userRepository.save(user);
        logger.info("Saving user with id" + savedUser.getId());
        return savedUser;
        }
    
    // delete User
        @DeleteMapping(path ="/delete/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
        public Response deleteUser(@PathVariable(value ="id") int id) 
        {
            logger.info("Deleted User with id"+id);
            userRepository.deleteById(id);
            return new Response("Deleted User with id" +id, null);
        }
        
    //get user by Username
    @GetMapping(path ="/userbynm/{nm}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserName(@PathVariable(value ="nm")String nm)
    {
        logger.info("Sending user with username:" +nm);
        Optional<User> _user = userRepository.findByNm(nm);
        if(!_user.isPresent())throw
        new NotFoundException("" +nm,"user","nm");
        else return _user.get();
    }
        
    //get user by Useremail
    @GetMapping(path ="/userbyemail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserEmail(@PathVariable(value ="email")String email)
    {
        logger.info("Sending user with useremail:" +email);
        Optional<User> _user = userRepository.findByEmail(email);
        if(!_user.isPresent())throw
        new NotFoundException("" +email,"user","email");
        else return _user.get();
    }
        
    //get user by name and password
    @GetMapping(path = "/{user_nm}/{user_password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserbyNmAndPassword
    (@PathVariable(value ="user_nm")String nm, @PathVariable(value ="user_password")String password)
    {
        logger.info("Sending user with name:" +nm+ "password:" +password);
        return userRepository.findByNmAndPassword(nm, password);
    }
    //working
     // change email account
     @PostMapping(path = "/changingemails", produces = MediaType.APPLICATION_JSON_VALUE)
     public Response changingEmailAccount(@RequestParam String email,@RequestParam int userId) 
     {
        Integer emailChange = userRepository.changingEmail(email,userId);
        return new Response("email updated ", emailChange);
     }
     //working
     // change phone number
     @PostMapping(path = "/changingphonenumbers", produces = MediaType.APPLICATION_JSON_VALUE)
     public Response changingPhoneNumber(@RequestParam String phoneNumber,@RequestParam int userId) 
     {
        Integer phoneNumberChange = userRepository.changingPhoneNumber(phoneNumber,userId);
        return new Response("phone number updated ", phoneNumberChange);
     }
     //working
     // change user name
     @PostMapping(path = "/changingusernames", produces = MediaType.APPLICATION_JSON_VALUE)
     public Response changingUserName(@RequestParam String nm,@RequestParam int userId) 
     {
        Integer usernmChange = userRepository.changingUserName(nm,userId);
        return new Response("username updated ", usernmChange);
     }
     //working
     // change place
     @PostMapping(path = "/changingplaces", produces = MediaType.APPLICATION_JSON_VALUE)
     public Response changingPlace(@RequestParam String place,@RequestParam int userId) 
     {
        Integer placeChange = userRepository.changingUserPlace(place,userId);
        return new Response("place updated ", placeChange);
     }
     //working
     // change password
     @PostMapping(path = "/changingpasswords", produces = MediaType.APPLICATION_JSON_VALUE)
     public Response changingPassword(@RequestParam String password,@RequestParam int userId) 
     {
        Integer passwordChange = userRepository.changingUserPassword(password, userId);
        return new Response("password updated ", passwordChange);
     }
    // change profile picture
    @PostMapping(path = "/changingprofilepicture", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response changingProfilePic(@RequestParam String image,@RequestParam int userId) 
    {
        Integer pictureChange = userRepository.changingProfilePicture(image, userId);
        return new Response("profile picture path updated ", pictureChange);
    }
}