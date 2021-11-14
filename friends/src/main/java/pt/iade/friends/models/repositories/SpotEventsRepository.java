package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.spotevents;

public interface SpotEventsRepository extends CrudRepository<spotevents, Integer> {
    public Iterable<spotevents> getSpotEventsById(int event_type_id);

}