package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Interest;

public interface InterestRepository extends CrudRepository<Interest, Integer> 
{
    
}