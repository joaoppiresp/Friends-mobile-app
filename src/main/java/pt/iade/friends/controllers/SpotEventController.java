package pt.iade.friends.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
    
    //byspotname
    @GetMapping(path = "/sptnames/{name}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEventView> getEventbysptnam(@PathVariable String name)
    {
        logger.info("Sending all events for spot with name "+name);
        return spotEventRepository.filterSptNm(name);
    }
    
}

/*


    //not working
    //bydate
    @GetMapping(path = "/dates/{evnt_date}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SpotEvent> getEvntbydates(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ") Timestamp evntdate) {
        logger.info("Sending all events for date "+evntdate);
        return spotEventRepository.filterDate(evntdate);
    }
    //not working
    //byspotname & evntdate
    @RequestMapping(value = "/name/{spot_name}/date/{evnt_date}", method=RequestMethod.GET)
    public Iterable<SpotEvent> getEvntbyNmDate(@RequestParam String name,@RequestParam Timestamp evntdate) {
        logger.info("Sending all events for spot with name "+name+" and date "+evntdate);
        return spotEventRepository.filterSptNameDate(name, evntdate);
    }
    
    //byevntname
    @GetMapping(path = "/evtnames/{evntNm}", produces= MediaType.APPLICATION_JSON_VALUE)
    public SpotEvent getEventbyNm(@PathVariable(value="event_name") String eventNm) throws NotFoundException
    {
        logger.info("Sending event with name "+eventNm);
        Optional<SpotEvent> _spotevent = spotEventRepository.findByeventNm(eventNm);
        if (!_spotevent.isPresent()) throw new NotFoundException(""+eventNm, "SpotEvent", "eventNm");
        else return _spotevent.get();
          
    }
    

*/