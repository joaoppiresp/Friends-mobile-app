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
    @Column(name = "senderid") private int senderId;
    @Column(name = "receiverid") private int receiverId;
    @Column(name = "friendship_status") private String friendshipStatus;
    @Column(name = "actiontakerid") private int actionTakerId;
    @Column(name = "datetime") public Double dateTime;

    public Friend(){}
        
    public int getSenderId() {return senderId;}
    public int getReceiverId() {return receiverId;}
    public String getFriendshipStatus() {return friendshipStatus;}
    public int getActionTakerId() {return actionTakerId;}
    public Double getDateTime() {return dateTime;}
 
   
}