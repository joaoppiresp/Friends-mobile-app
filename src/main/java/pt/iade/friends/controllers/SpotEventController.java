package pt.iade.friends.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Timestamp;
import java.util.Optional;
import pt.iade.friends.models.exceptions.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import pt.iade.friends.models.SpotEvent;
import pt.iade.friends.models.repositories.SpotEventRepository;
@RestController
@RequestMapping(path = "/api/events")
public class SpotEventController {

    private Logger logger = LoggerFactory.getLogger(SpotEventController.class);
    @Autowired
    private SpotEventRepository spotEventRepository;
    
    //byId
    @GetMapping(path = "/ids/{spotFK:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public SpotEvent getEvent(@PathVariable(value="spotFK") int spotFK) throws NotFoundException
    {
        logger.info("Sending all events for spot with id "+spotFK);
        Optional<SpotEvent> _spotevent = spotEventRepository.findById(spotFK);
        if (!_spotevent.isPresent()) throw new NotFoundException(""+spotFK, "SpotEvent", "spotFK");
        else return _spotevent.get();
          
    }
    /*
    @GetMapping(path = "/ids/{spotFK:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbyId(@PathVariable(value="spotFK") int spotFK) {
        logger.info("Sending all events for spot with id "+spotFK);
        return spotEventRepository.filtersptId(spotFK);
    }
    */
  
    //bydate
    @GetMapping(path = "/dates/{date}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbydates(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ") Timestamp evntdate) {
        logger.info("Sending all events for date "+evntdate);
        return spotEventRepository.filterDate(evntdate);
    }
   
    //byspotname
    @GetMapping(path = "/sptnames/{name}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbyNm(@PathVariable(value="name") String name) {
        logger.info("Sending all events for spot with name "+name);
        return spotEventRepository.filterSptNm(name);
    }

    //byspotname & evntdate
    @RequestMapping(value = "/name/{name}/{date}", method=RequestMethod.GET)
    public Iterable<SpotEvent> getEvntbyNmDate(@RequestParam String name,@RequestParam Timestamp evntdate) {
        logger.info("Sending all events for spot with name "+name+" and date "+evntdate);
        return spotEventRepository.filterSptNameDate(name, evntdate);
    }
    //Working
    //bytype
    @GetMapping(path = "/types/{evntTypeFK:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public SpotEvent getEventtp(@PathVariable(value="evntTypeFK") int evntTypeFK) throws NotFoundException
    {
        logger.info("Sending all events for type with id "+evntTypeFK);
        Optional<SpotEvent> _spotevent = spotEventRepository.findById(evntTypeFK);
        if (!_spotevent.isPresent()) throw new NotFoundException(""+evntTypeFK, "SpotEvent", "evntTypeFK");
        else return _spotevent.get();
          
    }

    //byevntname
    @GetMapping(path = "/evtnames/{evntNm}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntNm(@PathVariable(value="evntNm") String evntNm) {
        logger.info("Sending all events with the name "+evntNm);
        return spotEventRepository.filterEvntNm(evntNm);
    }
}