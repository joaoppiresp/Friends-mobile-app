package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friendgroup")

public class friendgroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_name")
    private String group_name;
    @Column(name = "group_id")
    private int group_id;
    @Column(name = "friends_id")
    private int friends_id;
    @Column(name = "gp_owner_id")
    private int gp_owner_id;

    public friendgroup() {
    }
    /*
     * public friendgroup(String group_name, int group_id, int friends_id, int
     * gp_owner_id) { this.group_name = group_name; this.group_id = group_id;
     * this.friends_id = friends_id; this.gp_owner_id = gp_owner_id; }
     */

    public String getGroup_Name() {
        return group_name;
    }

    public void setGroup_Name(String group_name) {
        this.group_name = group_name;
    }

    public int getGroup_Id() {
        return group_id;
    }

    public int getFriends_Id() {
        return friends_id;
    }

    public int getGp_Owner_Id() {
        return gp_owner_id;
    }

}
