package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Pricetype;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

public interface PricetypeRepository extends CrudRepository<Pricetype, Integer> {
        
}
