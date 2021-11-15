package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Interests;

public interface InterestsRepository extends CrudRepository<Interests, Integer> {
    public Iterable<Interests> getInterestsById(int interest_id);

}