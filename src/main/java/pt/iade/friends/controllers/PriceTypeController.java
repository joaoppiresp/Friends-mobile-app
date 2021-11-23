package pt.iade.friends.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import pt.iade.friends.models.Pricetype;
import pt.iade.friends.models.repositories.PricetypeRepository;
import org.springframework.web.bind.annotation.PathVariable;
import pt.iade.friends.models.exceptions.NotFoundException;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/pricetypes")
public class PriceTypeController {
    private Logger logger = LoggerFactory.getLogger(PriceTypeController.class);
    @Autowired
    private PricetypeRepository priceTypeRepository;
    
    //price type by id 
    @GetMapping(path= "/{prctpId:[0-9]+}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Pricetype getPrctpbyId(@PathVariable(value = "prctpId") int prctpId) throws NotFoundException
    {
       logger.info("Price types for id "+prctpId);
       Optional<Pricetype> _pricetype = priceTypeRepository.findById(prctpId);
       if (!_pricetype.isPresent()) throw new NotFoundException(""+prctpId, "PriceType", "prctpId");
       else return _pricetype.get();
    }
}
