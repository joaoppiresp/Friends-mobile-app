package pt.iade.friends.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FriendId implements Serializable{
    @Column(name = "senderid") public int senderId;
    @Column(name = "receiverid") public int receiverId;
    @Column(name = "friendship_status") public String status;
    
    public FriendId(){}

    public int getSenderId() {return senderId;}
    public void setSenderId(int senderId){this.senderId=senderId;}
    public int getReceiverId() {return receiverId;}
    public void setReceiverId(int receiverId){this.receiverId=receiverId;}
    public String getStatus() {return status;}
    public void setStatus(String status){this.status=status;}
    
    @Override
    public int hashCode(){
        final int prime = 31; //any number
        int result = 1;
        result = prime * result + senderId;
        result = prime * result + result;
        result = prime * result + ((status == null) ? 0 : status.hashCode());
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
        FriendId other = (FriendId) object;
        if(senderId != other.senderId)
            return false;
        if(status == null){
            if (other.status != null)
                return false;
        }else if(!this.status.equals(other.status)) return false;
        return false;
    }
    
}
