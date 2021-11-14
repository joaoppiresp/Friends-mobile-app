package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.InfoSpot;

public interface Info_SpotRepository extends CrudRepository<InfoSpot, Integer> {
    public Iterable<InfoSpot> getInfo_SpotById(int internal_id);

    public boolean deleteInfo_SpotById(int internal_id);
}