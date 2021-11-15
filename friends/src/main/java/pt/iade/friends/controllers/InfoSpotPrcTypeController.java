package pt.iade.friends.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.repositories.InfoSpotPrcTypeRepository;
import pt.iade.friends.models.pricetype;
import pt.iade.friends.models.InfoSpot;
import pt.iade.friends.models.infospotprctype;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Optional;
import javax.annotation.PostConstruct;
import pt.iade.friends.models.responses.Response;

@RestController
@RequestMapping(path = "/api/infospotprctypes")

public class InfoSpotPrcTypeController {
    private Logger logger = LoggerFactory.getLogger(FriendGroupController.class);
    @Autowired
    private InfoSpotPrcTypeRepository infoSpotPrcTypeRepository;

    // get all prices
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<infospotprctype> getAllprices() {
        logger.info("Sending all prices");
        return infoSpotPrcTypeRepository.findAll();
    }

}
