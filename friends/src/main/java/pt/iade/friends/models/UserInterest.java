package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userinterest")

public class UserInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_id")
    private int int_id;
    @Column(name = "interest_user_id")
    private int interest_user_id;
    @Column(name = "user_int_id")
    private int user_int_id;

    public UserInterest() {
    }
    /*
     * public UserInterest(int int_id, int interest_user_id, int user_int_id) {
     * this.int_id = int_id; this.interest_user_id = interest_user_id;
     * this.user_int_id = user_int_id; }
     */

    public int getInt_Id() {
        return int_id;
    }

    public int getInterest_User_Id() {
        return interest_user_id;
    }

    public int getUser_Int_Id() {
        return user_int_id;
    }
}
