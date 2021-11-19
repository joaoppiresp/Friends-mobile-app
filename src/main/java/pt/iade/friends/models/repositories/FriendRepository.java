package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Friend;
public interface FriendRepository extends CrudRepository<Friend, Integer> 
{

}

