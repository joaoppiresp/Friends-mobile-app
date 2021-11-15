package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.SpotEvents;

public interface SpotEventsRepository extends CrudRepository<SpotEvents, Integer> {
    public Iterable<SpotEvents> getSpotEventsById(int event_type_id);

}