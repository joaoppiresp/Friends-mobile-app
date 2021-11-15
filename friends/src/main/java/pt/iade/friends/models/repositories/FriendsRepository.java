package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Friends;

public interface FriendsRepository extends CrudRepository<Friends, Integer> {

    public Iterable<Friends> getFriendsById(int frnd_user_id);

    public Iterable<Friends> getAllFriends();

    public int saveFriend(int frnd_user_id);
}