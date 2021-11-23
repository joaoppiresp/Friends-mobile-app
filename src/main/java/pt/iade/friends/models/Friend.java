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
    @Column(name = "friend_id") private int frndUserId;
    @Column(name = "friendship_status") private String friendshipStatus;
    @Column(name = "mainuser_fk") private int mainuserId;

 
    public Friend(){}
    
    public String getFriendshipStatus() {return friendshipStatus;}
    public int getMainuserId() {return mainuserId;}
    public int getFrndUserId() {return frndUserId;}
   
}