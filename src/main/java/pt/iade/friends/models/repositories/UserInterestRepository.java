package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.UserInterest;

public interface UserInterestRepository extends CrudRepository<UserInterest, Integer> 
{
    
}
