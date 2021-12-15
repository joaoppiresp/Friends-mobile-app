package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Interest;
import java.util.Optional;

public interface InterestRepository extends CrudRepository<Interest, Integer> 
{
    Optional<Interest> findByIntType(String intType);
}