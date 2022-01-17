package pt.iade.friends.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "friendgroup")
public class FriendGroup
{
    @EmbeddedId
    private FriendGroupId id;

    public FriendGroup(){}
    
}