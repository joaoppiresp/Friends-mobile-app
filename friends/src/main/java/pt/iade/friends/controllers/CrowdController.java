package pt.iade.friends.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.repositories.CrowdRepository;
import pt.iade.friends.models.Crowd;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional; //to check id the input is something in the database or if its wrong

@RestController
@RequestMapping(path = "/api/crowds")
public class CrowdController {
    private Logger logger = LoggerFactory.getLogger(CrowdController.class);
    @Autowired
    private CrowdRepository CrowdRepository; // obj of crowdrepository to access its methods;

    // is there any point in having a finAll() for this table?
    // what methods are really important to have in this Controller?

    // crowd by crow_id
    @GetMapping(path = "{crowd_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Crowd getcrowdById(@PathVariable int crowd_id) {
        logger.info("Sending crowd info with id " + crowd_id);
        Optional<Crowd> _crowd = CrowdRepository.findById(crowd_id);
        if (_crowd.isPresent())
            return _crowd.get();
        else
            throw new NotFoundException("" + crowd_id, "crowd", "crowd_id");
    }

}
