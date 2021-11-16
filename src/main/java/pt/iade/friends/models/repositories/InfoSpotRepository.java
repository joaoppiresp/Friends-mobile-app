package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.InfoSpot;

public interface InfoSpotRepository extends CrudRepository<InfoSpot, Integer> 
{   
    //controller method to GET all spots 

    public Iterable<InfoSpot> getInfoSpots();

    //controller method to GET spots by their ids
    public int getSpotById(int id);

}