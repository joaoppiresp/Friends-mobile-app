package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.EventType;

public interface EventTypeRepository extends CrudRepository<EventType, Integer> {

    public Iterable<EventType> getEventTypeById(int evnt_type_id);

    public Iterable<EventType> findAll();
}
