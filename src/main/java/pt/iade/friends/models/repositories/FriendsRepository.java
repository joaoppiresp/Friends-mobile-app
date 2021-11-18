package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Friends;

public interface FriendsRepository extends CrudRepository<Friends, Integer> 
{

}

