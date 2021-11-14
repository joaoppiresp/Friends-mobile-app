package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.infospotprctype;

public interface InfoSpotPrcTypeRepository extends CrudRepository<infospotprctype, Integer> {
    public Iterable<infospotprctype> getInfoSpotPrcTypeById(int price_id);

}