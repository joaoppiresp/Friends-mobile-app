package pt.iade.friends.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Version;

@Embeddable
public class FriendGroupId implements Serializable {

    @Column(name = "group_name") public String gpname;
    @Version
    @Column(name = "owner_id") public int owner;
    @Column(name = "friend_fk") public int friendId;
    
    public FriendGroupId(){}

    public String getGpName() {return gpname;}
    public void setGpName(String gpname){this.gpname=gpname;}
    public int getOwnerId() {return owner;}
    public void setOwnerId(int owner){this.owner=owner;}
    public int getFriendFk(){return friendId;}
    public void setFriendFk(int friendId){this.friendId=friendId;}

    @Override
    public int hashCode(){
        final int prime = 31; //any number
        int result = 1;
        result = prime * result + ((gpname == null) ? 0 : gpname.hashCode());
        result = prime * result + owner;
        result = prime * result + friendId;
        return result;
    }

    @Override
    public boolean equals(Object object){
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        FriendGroupId other = (FriendGroupId) object;
        if(owner != other.owner)
            return false;
        if(gpname == null){
            if (other.gpname != null)
                return false;
        }else if(!this.gpname.equals(other.gpname)) return false;
        return false;
    }
}
