package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.eventtype;

public interface EventTypeRepository extends CrudRepository<eventtype, Integer> {
    public Iterable<eventtype> getEventTypeById(int evnt_type_id);

}
