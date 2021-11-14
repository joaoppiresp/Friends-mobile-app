package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.interests;

public interface InterestsRepository extends CrudRepository<interests, Integer> {
    public Iterable<interests> getInterestsById(int interest_id);

}