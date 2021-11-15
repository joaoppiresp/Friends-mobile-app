package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.TranspType;

public interface TranspTypeRepository extends CrudRepository<TranspType, Integer> {
    public Iterable<TranspType> getTranspTypeById(int trnsp_id);

}