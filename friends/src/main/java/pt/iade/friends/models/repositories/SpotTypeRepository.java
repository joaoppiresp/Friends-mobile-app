package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.SpotType;

public interface SpotTypeRepository extends CrudRepository<SpotType, Integer> {
    public Iterable<SpotType> getSpotTypeById(int spt_type_id);
}
