package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.InfoSpotPrcType;

public interface InfoSpotPrcTypeRepository extends CrudRepository<InfoSpotPrcType, Integer> {
    public Iterable<InfoSpotPrcType> getInfoSpotPrcTypeById(int price_id);

}