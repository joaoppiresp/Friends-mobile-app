package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friends")
public class Friends
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "frnd_user_id") private int frndUserId;
    @Column(name = "friendship_status") private String friendshipStatus;
    @Column(name = "mainuser_id") private int mainuserId;
    @Column(name = "grp_id") private int grp_Id;
 
    public Friends()
    {
    }

    public String getFriendshipStatus() {
        return friendshipStatus;
    }
    public int getMainuserId() {
        return mainuserId;
    }
    public int getFrndUserId() {
        return frndUserId;
    }

    public int getGrp_Id() {
        return grp_Id;
    }    
}