package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import pt.iade.friends.models.friendgroup;
import pt.iade.friends.models.friends;

public interface FriendGroupRepository extends CrudRepository<friendgroup, Integer> {

    public Iterable<friendgroup> getFriendGroupById(int group_id);

    public Iterable<friendgroup> getAllFriendGroups();

    public friendgroup saveFriendgroup(@RequestBody friendgroup friendgroup);

    public boolean deleteFriendGroup(int group_id);

    public int saveFriendInGroup(@Param("group_id") int group_id, @Param("friend") friends friends);

    public boolean deleteFriendFromGroup(int friends_id);
}
