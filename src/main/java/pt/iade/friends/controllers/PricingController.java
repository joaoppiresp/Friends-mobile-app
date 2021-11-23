package pt.iade.friends.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import pt.iade.friends.models.Pricing;
import pt.iade.friends.models.repositories.PricingRepository;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(path = "/api/prices")
public class PricingController {
    private Logger logger = LoggerFactory.getLogger(PricingController.class);
    @Autowired
    private PricingRepository pricingRepository;
    //not working
    //all prices for a spot
    @GetMapping(path = "/{spotId:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Pricing> getEvntbysptid(@RequestParam(value="spotId") int spotId) {
        logger.info("Sending all events for spot with id "+spotId);
        return pricingRepository.filterSpotId(spotId);
    }
}
