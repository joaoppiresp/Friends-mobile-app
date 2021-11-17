package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.friends.models.InfoSpot;
public interface InfoSpotRepository extends CrudRepository<InfoSpot, Integer> 
{   
    Iterable<InfoSpot> getSpot(@Param ("spotId") int spotId);
}