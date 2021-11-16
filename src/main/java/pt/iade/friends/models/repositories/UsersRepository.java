package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> 
{

}
