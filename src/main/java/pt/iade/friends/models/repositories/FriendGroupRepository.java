package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.FriendGroup;
import pt.iade.friends.models.Views.FriendGroupView;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface FriendGroupRepository extends CrudRepository<FriendGroup, Integer> 
{
    String getFriendGroup = "SELECT group_name AS gpname, owner_id AS owner, friend_fk AS friends, user_nm AS friendsnm FROM friendgroup "+
    "INNER JOIN users ON friendgroup.friend_fk=users.user_id "+
    "WHERE friendgroup.friendship_truth='A' ";

    String newGroup = "INSERT INTO friendgroup(group_name,owner_id,friend_fk,friendship_truth) "+
    "values(:gpname,:owner, :friends, :friendship)";

    String deleteGroups = "DELETE FROM friendgroup WHERE friendgroup.group_name=:gpname "+
    "AND friendgroup.owner_id=:owner ";

    String deletingFriendFromGroup = "DELETE FROM friendgroup WHERE friendgroup.group_name=:gpname "+
    "AND friendgroup.friend_fk=:friends";

    //groups by owner id
    @Query(value=getFriendGroup + "AND friendgroup.owner_id=:owner", nativeQuery=true)
    Iterable<FriendGroupView> filterbyOwner(@Param("owner") int owner);

    //saving a new group
    @Modifying @Transactional(readOnly = false)
    @Query(value=newGroup, nativeQuery=true)
    Integer saveGroup(@Param("gpname") String gpname,
                      @Param("owner") int owner,
                      @Param("friends") int friends,
                      @Param("friendship") String friendship);

    //deleting a group
    @Modifying @Transactional(readOnly = false)
    @Query(value=deleteGroups, nativeQuery=true)
    Integer deleteGroup(@Param("gpname") String gpname, @Param("owner") int owner);

    //removing a friend from a group
    @Modifying @Transactional(readOnly = false)
    @Query(value=deletingFriendFromGroup, nativeQuery=true)
    Integer deleteFromGroup(@Param("gpname") String gpname, @Param("friends") int friends);
}
