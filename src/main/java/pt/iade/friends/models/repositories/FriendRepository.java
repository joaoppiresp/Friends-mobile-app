package pt.iade.friends.models.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.friends.models.Friend;
import pt.iade.friends.models.Views.FriendView;
public interface FriendRepository extends CrudRepository<Friend, Integer> 
{
    String getNmReceiverid = " Select senderid, "+
    "receiverid, "+
    "friendship_status, "+
    "actiontakerid, "+
    "user_nm AS receivernm "+ 
    "From friends "+
    "Inner Join users on friends.actiontakerid=users.user_id "+
    "WHERE friends.friendship_status='A' ";

    

    //friends by A with name
    @Query(value=getNmReceiverid + "AND friends.senderid=:senderId", nativeQuery = true)
    Iterable<FriendView> filtersenderId(@Param("senderId") int senderId);
        
}

