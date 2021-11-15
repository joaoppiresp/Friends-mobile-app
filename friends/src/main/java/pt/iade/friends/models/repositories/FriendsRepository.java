package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.friends.models.Users;
import pt.iade.friends.models.friends;

public interface FriendsRepository extends CrudRepository<friends, Integer> {

    public Iterable<friends> getFriendsById(int frnd_user_id);

    public Iterable<friends> getAllFriends();

    public int saveFriend(int frnd_user_id);
}