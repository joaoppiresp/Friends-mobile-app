package pt.iade.friends.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.friends.models.repositories.InfoSpotPrcTypeRepository;
import pt.iade.friends.models.InfoSpotPrcType;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(path = "/api/infospotprctypes")

public class InfoSpotPrcTypeController {
    private Logger logger = LoggerFactory.getLogger(FriendGroupController.class);
    @Autowired
    private InfoSpotPrcTypeRepository infoSpotPrcTypeRepository;

    // get all prices
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<InfoSpotPrcType> getAllprices() {
        logger.info("Sending all prices");
        return infoSpotPrcTypeRepository.findAll();
    }

}
