package pt.iade.friends.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Timestamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.SpotEvent;
import pt.iade.friends.models.Eventtype;
import pt.iade.friends.models.repositories.SpotEventRepository;
@RestController
@RequestMapping(path = "/api/events")
public class SpotEventController {

    private Logger logger = LoggerFactory.getLogger(SpotEventController.class);
    @Autowired
    private SpotEventRepository spotEventRepository;

    //byId
    @GetMapping(path = "/{id}/ids", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbyId(@PathVariable int spotId) {
        logger.info("Sending all events for spot with id "+spotId);
        return spotEventRepository.filtersptId(spotId);
    }
    //bydate
    @GetMapping(path = "/{id}/dates", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbydates(@PathVariable Timestamp evntdate) {
        logger.info("Sending all events for date "+evntdate);
        return spotEventRepository.filterDate(evntdate);
    }
    //byspotname
    @GetMapping(path = "/{id}/sptnames", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbyNm(@PathVariable String name) {
        logger.info("Sending all events for spot with name "+name);
        return spotEventRepository.filterSptNm(name);
    }
    //byspotname & evntdate
    @GetMapping(path = "/{id}/nmdates", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbyNmDate(@PathVariable String name, @PathVariable Timestamp evntdate) {
        logger.info("Sending all events for spot with name "+name+" and date "+evntdate);
        return spotEventRepository.filterSptNameDate(name, evntdate);
    }
    //bytype
    @GetMapping(path = "/{id}/types", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbytype(@PathVariable String evntTp) {
        logger.info("Sending all events of type "+evntTp);
        return spotEventRepository.filterType(evntTp);
    }
    //byevntname
    @GetMapping(path = "/{id}/evtnames", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntNm(@PathVariable String evntNm) {
        logger.info("Sending all events with the name "+evntNm);
        return spotEventRepository.filterEvntNm(evntNm);
    }

}
