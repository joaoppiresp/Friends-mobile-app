package pt.iade.friends.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.friends.models.Views.SpotEventView;
import pt.iade.friends.models.repositories.SpotEventRepository;
@RestController
@RequestMapping(path = "/api/events")
public class SpotEventController {
    
    private Logger logger = LoggerFactory.getLogger(SpotEventController.class);
    @Autowired
    private SpotEventRepository spotEventRepository;

    //Working
    //byspotid
    @GetMapping(path = "/spotids/{spotFK:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEventView> getEvntbyId(@PathVariable int spotFK){

        logger.info("Sending all events for spot with id "+spotFK);
        return spotEventRepository.filtersptId(spotFK);

    }
    //Working
    //by type of event (id)
    @GetMapping(path = "/types/{evntTypeFK:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEventView> getEventtp(@PathVariable int evntTypeFK) 
    {
        logger.info("Sending all events for type with id "+evntTypeFK);
        return spotEventRepository.filterType(evntTypeFK);
          
    }
    //Working
    //byspotname
    @GetMapping(path = "/sptnames/{name}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEventView> getEventbysptnam(@PathVariable String name)
    {
        logger.info("Sending all events for spot with name "+name);
        return spotEventRepository.filterSptNm(name);
    }
    //Working
    //byevntname
    @GetMapping(path = "/evtnames/{eventNm}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEventView> getEventbyNm(@PathVariable String eventNm)
    {
        logger.info("Sending event with name "+eventNm);
        return spotEventRepository.filterEvntNm(eventNm);
    }
    //Working
    //byevntid
    @GetMapping(path = "/evtids/{evntId:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEventView> getEventbyevtid(@PathVariable int evntId)
    {
        logger.info("Sending event with id "+evntId);
        return spotEventRepository.filterEvntId(evntId);
    }
    //Working
    //bydate
    @GetMapping(path = "/dates/{dateMilis}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEventView> getEvntbydates(@PathVariable Double dateMilis)
    {
        logger.info("Sending all events for date "+dateMilis);
        return spotEventRepository.filterDate(dateMilis);
    }
    //not Working
    //byspotname & evntdate
    @GetMapping(value = "/names/{name}/dates/{dateMilis}", produces=MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEventView> getEvntbyNmDate(@PathVariable String name,@PathVariable Double dateMilis) {
        logger.info("Sending all events for spot with name "+name+" and date "+dateMilis);
        return spotEventRepository.filterSptNameDate(name, dateMilis);
    }
}
