package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.TspUserSpot;

public interface TspUserSpotRepository extends CrudRepository<TspUserSpot, Integer> {
    public Iterable<TspUserSpot> getTspUserSpotById(int tsp_id);

}