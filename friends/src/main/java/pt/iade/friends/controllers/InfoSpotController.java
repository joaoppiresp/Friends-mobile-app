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
@RequestMapping(path = "/api/infospots")
public class InfoSpotController {
    private Logger logger = LoggerFactory.getLogger(InfoSpotController.class);
    @Autowired
    private InfoSpotRepository infospotRepository;

    // get all spots
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<InfoSpot> getInfoSpots() {
        logger.info("Sending all infospots");
        return infospotRepository.findAll();
    }

    // get spot by id
    @GetMapping(path = "{spot_db_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public InfoSpot getInfoSpotById(@PathVariable int spot_db_id) {
        logger.info("Sending all info_spots");
        Optional<InfoSpot> _info_spot = infospotRepository.findById(spot_db_id);
        if (_info_spot.isPresent())
            return _info_spot.get();
        else
            throw new NotFoundException("" + spot_db_id, "infospots", "spot_db_id");

    }

    // add a new spot
    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public InfoSpot saveInfoSpot(@RequestBody InfoSpot infospot) {
        logger.info("Saving infospot with name: " + infospot.getSpot_Name());
        InfoSpot newInfoSpot = infospotRepository.save(infospot);
        return newInfoSpot;

    }

    // delete a spot
    @DeleteMapping(path = "{spot_db_id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteInfoSpotById(@PathVariable int spot_db_id) {
        logger.info("delete InfoSpot with spot_db_id: " + spot_db_id);
        if (infospotRepository.deleteInfoSpotById(spot_db_id))
            return new Response(spot_db_id + "was deleted.", null);
        else
            return new Response(spot_db_id + "not found.", null);
    }
}
