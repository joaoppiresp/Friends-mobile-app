package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.friendgroup;

public interface FriendGroupRepository extends CrudRepository<friendgroup, Integer> {
    public Iterable<friendgroup> getFriendGroupById(int group_id);

}