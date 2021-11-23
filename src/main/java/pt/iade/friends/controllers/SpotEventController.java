package pt.iade.friends.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Timestamp;
import java.util.Map;

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
    @GetMapping(path = "/ids/{spotId:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbyId(@PathVariable("id") int spotId) {
        logger.info("Sending all events for spot with id "+spotId);
        return spotEventRepository.filtersptId(spotId);
    }
    //bydate
    @GetMapping(path = "/dates/{date}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbydates(@PathVariable("evntdate") Timestamp evntdate) {
        logger.info("Sending all events for date "+evntdate);
        return spotEventRepository.filterDate(evntdate);
    }
    //byspotname
    @GetMapping(path = "/sptnames/{name}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbyNm(@PathVariable("name") String name) {
        logger.info("Sending all events for spot with name "+name);
        return spotEventRepository.filterSptNm(name);
    }
    //byspotname & evntdate
    @RequestMapping(value = "/name/date", method=RequestMethod.GET)
    public Iterable<SpotEvent> getEvntbyNmDate(@RequestParam String name,@RequestParam Timestamp evntdate) {
        logger.info("Sending all events for spot with name "+name+" and date "+evntdate);
        return spotEventRepository.filterSptNameDate(name, evntdate);
    }
    //bytype
    @GetMapping(path = "/types", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbytype(@PathVariable("evntTp") String evntTp) {
        logger.info("Sending all events of type "+evntTp);
        return spotEventRepository.filterType(evntTp);
    }
    //byevntname
    @GetMapping(path = "/evtnames", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntNm(@PathVariable("evntNm") String evntNm) {
        logger.info("Sending all events with the name "+evntNm);
        return spotEventRepository.filterEvntNm(evntNm);
    }

}
