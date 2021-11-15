package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Crowd;

public interface CrowdRepository extends CrudRepository<Crowd, Integer> {

    public Iterable<Crowd> getCrowdById(int crowd_id);

}
