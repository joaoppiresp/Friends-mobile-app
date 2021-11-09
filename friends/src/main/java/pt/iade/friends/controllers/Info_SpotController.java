package pt.iade.friends.controllers;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.friends.models.exceptions.NotFoundException;
import pt.iade.friends.models.Info_Spot;
import pt.iade.friends.models.repositories.Info_SpotRepository;

@RestController
@RequestMapping(path = "/api/info_spot")
public class Info_SpotController 
{
    private Logger logger = LoggerFactory.getLogger(Info_SpotController.class);
    @Autowired
    private Info_SpotRepository info_spotRepository;
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    public Iterable <Info_Spot> getInfo_Spots() 
    {
        logger.info("Sending all info_spots");
        return info_spotRepository.findAll();
    }

    @GetMapping(path = "{internal_id}", produces = MediaType.APPLICATION_JSON_VALUE)
    
    public Info_Spot getInfo_SpotById(@PathVariable int internal_id)
    {
        logger.info("Sending all info_spots");
        Optional<Info_Spot> _info_spot = info_spotRepository.findById(internal_id);
        if(_info_spot.isPresent()) return _info_spot.get();
        else
        throw new NotFoundException(""+ internal_id, "info_spots", "internal_id"); 
        
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)

    public Info_Spot saveInfo_Spot(@RequestBody Info_Spot info_spot)
    {
        logger.info("Saving info_spot with name: "+info_spot.getName());
        Info_Spot newInfo_Spot = info_spotRepository.save(info_spot);
        return newInfo_Spot;

    }

    /*@DeleteMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteUnit(@PathVariable int id) 
    {
        logger.info("Deleting spot with id " + id);
        // No verification to see if it exists
        spotRepository.deleteById(id);
        return new Response("Deleted spot with id " + id, null);
        
    }*/
}
