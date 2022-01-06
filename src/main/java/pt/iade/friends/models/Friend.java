package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

import org.hibernate.exception.DataException;

@Entity
@Table(name = "friends")
public class Friend
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "senderid") public int senderId;
    @Column(name = "receiverid") public int receiverId;
    @Column(name = "friendship_status") public String friendshipStatus;
    @Column(name = "actiontakerid") public int actionTakerId;
    @Column(name = "datetime") public Data dateTime;

    public Friend(){}
        
    public int getSenderId() {return senderId;}
    public int getReceiverId() {return receiverId;}
    public String getFriendshipStatus() {return friendshipStatus;}
    public int getActionTakerId() {return actionTakerId;}
    public Data getDateTime() {return dateTime;}
 
   
}