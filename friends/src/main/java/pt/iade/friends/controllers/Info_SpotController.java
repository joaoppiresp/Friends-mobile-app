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
import org.springframework.web.bind.annotation.RestController;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.InfoSpot;
import pt.iade.friends.models.repositories.InfoSpotRepository;
import pt.iade.friends.models.responses.Response;

@RestController
@RequestMapping(path = "/api/info_spot")
public class Info_SpotController {
    private Logger logger = LoggerFactory.getLogger(Info_SpotController.class);
    @Autowired
    private InfoSpotRepository info_spotRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    public Iterable<InfoSpot> getInfo_Spots() {
        logger.info("Sending all info_spots");
        return info_spotRepository.findAll();
    }

    @GetMapping(path = "{internal_id}", produces = MediaType.APPLICATION_JSON_VALUE)

    public InfoSpot getInfo_SpotById(@PathVariable int internal_id) {
        logger.info("Sending all info_spots");
        Optional<InfoSpot> _info_spot = info_spotRepository.findById(internal_id);
        if (_info_spot.isPresent())
            return _info_spot.get();
        else
            throw new NotFoundException("" + internal_id, "info_spots", "internal_id");

    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    public InfoSpot saveInfo_Spot(@RequestBody InfoSpot info_spot) {
        logger.info("Saving info_spot with name: " + info_spot.getSpot_Name());
        InfoSpot newInfo_Spot = info_spotRepository.save(info_spot);
        return newInfo_Spot;

    }

    @DeleteMapping(path = "{internal_id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteInfo_SpotById(@PathVariable int internal_id) {
        logger.info("delete Info_Spot with internal_id: " + internal_id);
        if (info_spotRepository.deleteInfo_SpotById(internal_id))
            return new Response(internal_id + "was deleted.", null);
        else
            return new Response(internal_id + "not found.", null);
    }
}
