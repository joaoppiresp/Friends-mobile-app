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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id") public int ownerId;
    @Column(name = "group_name") public String name;
    @Column(name = "friend_fk") public int friendId;
    @Column(name = "friendship_truth") public String friendship;

    public FriendGroup(){}
    
    
    public String getName() {return name;}
    public int getOwnerId() {return ownerId;}
    public int getFriendFk(){return friendId;}
    public String getFriendshipTruth(){return friendship;}
}