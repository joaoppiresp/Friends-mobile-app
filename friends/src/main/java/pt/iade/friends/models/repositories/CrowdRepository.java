package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.crowd;

public interface CrowdRepository extends CrudRepository<crowd, Integer> {

    public Iterable<crowd> getCrowdById(int crowd_id);

}
