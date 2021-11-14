package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import microsoft.sql.DateTimeOffset;

@Entity
@Table(name = "users")

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_email")
    private String user_email;
    @Column(name = "user_phone_number")
    private String user_phone_number;
    @Column(name = "user_public_id")
    private int user_public_id;
    @Column(name = "user_db_id")
    private int user_db_id;
    @Column(name = "user_nm")
    private String user_nm;
    @Column(name = "frnds")
    private int frnds;
    @Column(name = "gender")
    private char gender;
    @Column(name = "user_bday")
    private DateTimeOffset user_bday;
    @Column(name = "user_interest_id")
    private int user_interest_id;
    @Column(name = "f_group_id")
    private int f_group_id;
    @Column(name = "trnsp")
    private int trnsp;
    @Column(name = "at_spot_id")
    private int at_spot_id;
    @Column(name = "user_place")
    private String user_place;

    public Users(String user_email, String user_phone_number, int user_db_id, int user_public_id, String user_nm,
            int frnds, char gender, DateTimeOffset user_bdate, int user_interest_id, int f_group_id, int trnsp,
            int at_spot_id, String user_place) {
        this.user_email = user_email;
        this.user_phone_number = user_phone_number;
        this.user_db_id = user_db_id;
        this.user_public_id = user_public_id;
        this.user_nm = user_nm;
        this.frnds = frnds;
        this.gender = gender;
        // this.user_bdate = user_bdate;
        this.user_interest_id = user_interest_id;
        this.f_group_id = f_group_id;
        this.trnsp = trnsp;
        this.at_spot_id = at_spot_id;
        this.user_place = user_place;

    }

    public String getUserEmail() {
        return user_email;
    }

    public void setUserEmail(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_Phone_number() {
        return user_phone_number;
    }

    public void setPhone_number(String user_phone_number) {
        this.user_phone_number = user_phone_number;
    }

    public int getUser_Public_id() {
        return user_public_id;
    }

    public int getUser_db_id() {
        return user_db_id;
    }

    public String getUser_nm() {
        return user_nm;
    }

    public void setUser_Nm(String user_nm) {
        this.user_nm = user_nm;
    }

    public int getFrnds() {
        return frnds;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public DateTimeOffset getUser_Bday() {
        return user_bday;
    }

    public void setUser_Bday(DateTimeOffset user_bday) {
        this.user_bday = user_bday;
    }

    public int getUser_Interest_Id() {
        return user_interest_id;
    }

    public int getF_group_Id() {
        return f_group_id;
    }

    public int get_Trnsp() {
        return trnsp;
    }

    public int getAt_Spot_Id() {
        return at_spot_id;
    }

    public String getUser_Place() {
        return user_place;
    }

    public void setUser_Place(String user_place) {
        this.user_place = user_place;
    }

}