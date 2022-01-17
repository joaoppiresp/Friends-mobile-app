package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "friends")
public class Friend
{
    @EmbeddedId
    private FriendId id;

    @Column(name = "actiontakerid") public int actionTakerId;
    @Column(name = "datetime") public Double dateTime;

    public Friend(){};
        
    public int getActionTakerId() {return actionTakerId;}
    public Double getDateTime() {return dateTime;}
 
   
}