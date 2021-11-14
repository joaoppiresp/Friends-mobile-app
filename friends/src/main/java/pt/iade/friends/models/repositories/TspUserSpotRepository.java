package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.tspuserspot;

public interface TspUserSpotRepository extends CrudRepository<tspuserspot, Integer> {
    public Iterable<tspuserspot> getTspUserSpotById(int tsp_id);

}