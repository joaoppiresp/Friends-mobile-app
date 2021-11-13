package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Info_Spot;

public interface Info_SpotRepository extends CrudRepository<Info_Spot,Integer> 
{
    public Iterable<Info_Spot> getInfo_SpotById(int internal_id);
    public boolean deleteInfo_SpotById(int internal_id);
} 