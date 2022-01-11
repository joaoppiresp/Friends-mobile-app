package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friendgroup")
public class FriendGroup
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "owner_id") public int owner;
    @Column(name = "group_name") public String gpname;
    @Column(name = "friend_fk") public int friendId;
    @Column(name = "friendship_truth") public String friendship;

    public FriendGroup(){}
    
    
    public String getGpName() {return gpname;}
    public int getOwnerId() {return owner;}
    public int getFriendFk(){return friendId;}
    public String getFriendshipTruth(){return friendship;}
}