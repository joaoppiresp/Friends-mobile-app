package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.User;

public interface UserRepository extends CrudRepository<User, Integer> 
{
}
