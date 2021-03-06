package pt.iade.friends.models.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Pricetype;

public interface PricetypeRepository extends CrudRepository<Pricetype, Integer> {
        Optional<Pricetype> findById(int prctpId);
}
