package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.pricetype;

public interface PriceTypeRepository extends CrudRepository<pricetype, Integer> {
    public Iterable<pricetype> getInterestsById(int prc_type_id);

}