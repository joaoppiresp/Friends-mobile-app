package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.PriceType;

public interface PriceTypeRepository extends CrudRepository<PriceType, Integer> {
    public Iterable<PriceType> getInterestsById(int prc_type_id);

}