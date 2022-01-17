package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "friendgroup")
public class FriendGroup
{
    @EmbeddedId
    private FriendGroupId id;


    
    public FriendGroup(){}
    
}