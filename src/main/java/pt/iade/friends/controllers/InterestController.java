package pt.iade.friends.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pt.iade.friends.models.responses.Response;
import java.util.Optional;
import pt.iade.friends.models.Interest;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.repositories.InterestRepository;

@RestController
@RequestMapping(path = "/api/interests")
public class InterestController 
{
    private Logger logger = LoggerFactory.getLogger(InterestController.class);
    @Autowired
    private InterestRepository interestRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    // get all interests
    public Iterable <Interest> getInterest() 
    {
        logger.info(" Sending all Interests ");
        return interestRepository.findAll();
    }

        // save Interest
        @PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
        public Interest saveInterest(@RequestBody Interest interest) 
        {
            Interest saveInterest = interestRepository.save(interest);
        logger.info(" Saving interest with id " + saveInterest.interestId);
        return saveInterest;
        }
    
        // delete Interest
        @DeleteMapping(path = "/delete/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
        public Response deleteInterest(@PathVariable(value="id") int id) 
        {
            logger.info(" Deleted Interest with id "+id);
            interestRepository.deleteById(id);
            return new Response(" Deleted Interest with id "+id, null);
    }

    //get interest by name
    @GetMapping(path="/interestbyname/{intType}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Interest getInterestName(@PathVariable(value ="intType")String intType)
    {
        logger.info("Sending interest with name: " + intType);
        Optional<Interest> _interest = interestRepository.findByIntType(intType);
        if(!_interest.isPresent())throw
        new NotFoundException("" + intType, "interest", "name");
        else return _interest.get();
    }
}
    
    