package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.transptype;

public interface TranspTypeRepository extends CrudRepository<transptype, Integer> {
    public Iterable<transptype> getTranspTypeById(int trnsp_id);

}