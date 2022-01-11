package pt.iade.friends.controllers;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.friends.models.Crowd;
import pt.iade.friends.models.repositories.CrowdRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pt.iade.friends.models.exceptions.NotFoundException;


@RestController
@RequestMapping(path = "/api/crowds")
public class CrowdController {

    private Logger logger = LoggerFactory.getLogger(CrowdController.class);
    @Autowired
    private CrowdRepository crowdRepository;

}
