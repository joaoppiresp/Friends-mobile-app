package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friends")
public class Friend
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friend_id") private int friendId;
    @Column(name = "mainuser_fk") private int mainuserFk;
    @Column(name = "friendship_status") private String friendshipStatus;

 
    public Friend(){}
    
    public int getFriendId() {return friendId;}
    public int getMainuserFk() {return mainuserFk;}
    public String getFriendshipStatus() {return friendshipStatus;}
   
}