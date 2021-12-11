package pt.iade.friends.controllers;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.friends.models.Interest;
import pt.iade.friends.models.repositories.InterestRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pt.iade.friends.models.exceptions.NotFoundException;

@RestController
@RequestMapping(path = "/api/interests")
public class InterestController {
    private Logger logger = LoggerFactory.getLogger(InterestController.class);
    @Autowired
    private InterestRepository interestRepository;
    
    // get all interests 
    @GetMapping(path = "/interests", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Interest> getInterests() 
    {
        logger.info(" showing all interests ");
        return interestRepository.findAll();
    }
    // get interests by id
    @GetMapping(path= "/{interestId:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Interest getInterestId(@PathVariable(value = "interestId") int interestId) throws NotFoundException
    {
       logger.info("showing interests with id "+interestId);
       Optional<Interest> _interest = interestRepository.findById(interestId);
       if (!_interest.isPresent()) throw new NotFoundException(""+interestId, "Interest", "evntId");
       else return _interest.get();
    }
}