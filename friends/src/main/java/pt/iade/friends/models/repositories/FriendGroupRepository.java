package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import pt.iade.friends.models.FriendGroup;
import pt.iade.friends.models.Friends;

public interface FriendGroupRepository extends CrudRepository<FriendGroup, Integer> {

    public Iterable<FriendGroup> getFriendGroupById(int group_id);

    public Iterable<FriendGroup> getAllFriendGroups();

    public FriendGroup saveFriendgroup(@RequestBody FriendGroup friendgroup);

    public boolean deleteFriendGroup(int group_id);

    public int saveFriendInGroup(@Param("group_id") int group_id, @Param("friend") Friends friends);

    public boolean deleteFriendFromGroup(int friends_id);
}
