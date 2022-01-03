package pt.iade.friends.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.friends.models.repositories.FavouriteSpotsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pt.iade.friends.models.FavouriteSpots;
import pt.iade.friends.models.Views.FavouriteSpotsView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(path = "/api/favourites")
public class FavouriteSpotsController {
    
    private Logger logger = LoggerFactory.getLogger(FavouriteSpotsController.class);
    @Autowired
    private FavouriteSpotsRepository favouriteSpotsRepository;

    //get all favourite spots for the user x
    @GetMapping(path = "/byusers/{userFk:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<FavouriteSpotsView> getfavouritebyUserId(@PathVariable int userFk){

        logger.info("sending all favourite spots for user with id:  "+userFk);
        return favouriteSpotsRepository.filterUserId(userFk);

    }
    
    //save a spot as favourite
    @PostMapping(path = "/saves", produces = MediaType.APPLICATION_JSON_VALUE)
        public FavouriteSpots saveFavouriteSpots(@RequestBody FavouriteSpots favouriteSpots) 
        {
            FavouriteSpots saveFavouriteSpots = favouriteSpotsRepository.save(favouriteSpots);
            logger.info(" Saving favourite spot for user with id "+saveFavouriteSpots.getUserFk());
            return saveFavouriteSpots;
        }


}
