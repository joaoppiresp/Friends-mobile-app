package pt.iade.friends.models.repositories;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import pt.iade.friends.models.Friend;
import pt.iade.friends.models.Views.FriendView;
public interface FriendRepository extends CrudRepository<Friend, Integer> 
{
    String getNmReceiverid = " Select senderid, "+
    "receiverid, "+
    "friendship_status AS status, "+
    "actiontakerid, "+
    "user_nm AS receivernm "+ 
    "From friends "+
    "Inner Join users on friends.actiontakerid=users.user_id "+
    "WHERE friends.friendship_status='A' ";    

    String getRequests = " Select senderid, "+
    "receiverid, "+
    "friendship_status AS status, "+
    "actiontakerid, "+
    "user_nm AS receivernm "+ 
    "From friends "+
    "Inner Join users on friends.receiverid=users.user_id "+
    "WHERE friends.friendship_status='R' ";

    String friendRequests ="INSERT INTO friends(friendship_status,senderid,receiverid,actiontakerid) "+
    "values(:status,:senderId,:receiverId,:actionTakerId)";

    String AcceptRequests ="INSERT INTO friends(friendship_status,senderid,receiverid,actiontakerid) "+
    "values(:status,:senderId,:receiverId,:actionTakerId)";

    //checking requests made
    @Query(value=getRequests + "AND friends.senderid=:senderId", nativeQuery = true)
    Iterable<FriendView> filterRequests(@Param("senderId") int senderId);

    //friends
    @Query(value=getNmReceiverid + "AND friends.senderid=:senderId", nativeQuery = true)
    Iterable<FriendView> filtersenderId(@Param("senderId") int senderId);

    //sending friend request
    @Modifying @Transactional(readOnly = false)
    @Query(value=friendRequests, nativeQuery=true)
    Integer friendRequest(@Param("status") String status,
                          @Param("senderId") int senderId,
                          @Param("receiverId") int receiverId,
                          @Param("actionTakerId") int actionTakerId);
        
    //accepting a friend request
    @Modifying @Transactional(readOnly = false)
    @Query(value=AcceptRequests, nativeQuery=true)
    Integer acceptingRequests(@Param("status") String status,
                              @Param("senderId") int senderId,
                              @Param("receiverId") int receiverId,
                              @Param("actionTakerId") int actionTakerId);
        
}
