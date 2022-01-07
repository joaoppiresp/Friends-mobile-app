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
    @Column(name = "friendgroup_id") public int friendgroupId;
    @Column(name = "group_name") public String name;
    @Column(name = "owner_id") public int ownerId;
    @Column(name = "friend_fk") public int friendFk;

    public FriendGroup(){}
    
    public int getFriendGroupId() {return friendgroupId;}
    public String getName() {return name;}
    public int getOwnerId() {return ownerId;}
    public int getFriendFk(){return friendFk;}
}