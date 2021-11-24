package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friends")
public class FriendGroup
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id") private int ownerId;
    @Column(name = "group_name") private String groupName;
    @Column(name = "group_id") private int groupId;
    @Column(name = "friend_fk") private int friendFk;

    public FriendGroup(){}
    
    public int getOwnerId() {return ownerId;}
    public String getGroupName() {return groupName;}
    public int getGroupId() {return groupId;}
    public int getFriendFk(){return friendFk;}
}