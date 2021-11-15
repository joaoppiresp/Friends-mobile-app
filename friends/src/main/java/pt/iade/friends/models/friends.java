package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friends")

public class friends {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mainuser_id")
    private int mainuser_id;
    @Column(name = "friendship_status")
    private String friendship_status;
    @Column(name = "frnd_user_id")
    private int frnd_user_id;
    @Column(name = "grp_id")
    private int grp_id;

    public friends() {
    }
    /*
     * public friends(int mainuser_id, String friendship_status, int frnd_user_id,
     * int grp_id) { this.mainuser_id = mainuser_id; this.friendship_status =
     * friendship_status; this.frnd_user_id = frnd_user_id; this.grp_id = grp_id; }
     */

    public int getMainuser_Id() {
        return mainuser_id;
    }

    public String getFriendship_Status() {
        return friendship_status;
    }

    public int getFrnd_User_Id() {
        return frnd_user_id;
    }

    public int getGrp_Id() {
        return grp_id;
    }

}
