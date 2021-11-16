package pt.iade.friends.models.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.InfoSpot;
import org.springframework.data.repository.query.Param;
public interface InfoSpotRepository extends CrudRepository<InfoSpot, Integer> 
{   String allspotsQuery = "SELECT * FROM infospots";
    //controller method to GET all spots 
    @Query(value=allspotsQuery, nativeQuery=true)
    public Iterable<InfoSpot> getInfoSpots(@Param("id") int id);

    //controller method to GET spots by their ids
    public int getSpotById(int id);

}