package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.FriendGroup;
import pt.iade.friends.models.Views.FriendGroupView;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

public interface FriendGroupRepository extends CrudRepository<FriendGroup, Integer> 
{
    String getFriendGroup = "SELECT group_name, owner_id AS owner, friend_fk AS friends, user_nm AS friendsnm FROM friendgroup "+
    "INNER JOIN users ON friendgroup.friend_fk=users.user_id "+
    "WHERE friendgroup.friendship_truth='A' ";

    //groups by owner id
    @Query(value=getFriendGroup + "AND friendgroup.owner_id=:owner", nativeQuery=true)
    Iterable<FriendGroupView> filterbyOwner(@Param("owner") int owner);
}
