package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "friendgroup")
public class FriendGroup
{
    @EmbeddedId
    private FriendGroupId id;

    @Column(name="friendship_truth") public String friendship;

    public FriendGroup(){}

    public String getFriendship(){return friendship;}
}