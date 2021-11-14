package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.InfoSpot;

public interface InfoSpotRepository extends CrudRepository<InfoSpot, Integer> {
    public Iterable<InfoSpot> getInfoSpotById(int spot_db_id);

    public boolean deleteInfoSpotById(int spot_db_id);
}