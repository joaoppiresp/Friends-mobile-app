package pt.iade.friends.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FriendGroupId implements Serializable {

    @Column(name = "owner_id") public int owner;
    @Column(name = "group_name") public String gpname;
    @Column(name = "friend_fk") public int friendId;
    
    public FriendGroupId(){}

    public String getGpName() {return gpname;}
    public int getOwnerId() {return owner;}
    public int getFriendFk(){return friendId;}
}
