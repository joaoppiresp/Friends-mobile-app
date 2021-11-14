package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.spottype;

public interface SpotTypeRepository extends CrudRepository<spottype, Integer> {
    public Iterable<spottype> getSpotTypeById(int spt_type_id);

}
