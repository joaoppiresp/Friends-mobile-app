package pt.iade.friends.models;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class Users 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_email") private String email;
    @Column(name = "user_phone_number") private String phoneNumber;
    @Column(name = "user_public_id") private int publicId;
    @Column(name = "user_db_id") private int id;
    @Column(name = "user_nm") private String nm;
    @Column(name = "frnds") private int frnds;
    @Column(name = "gender") private char gender;
    @Column(name = "user_bday") private Date bday;
    @Column(name = "user_interest_id") private int interestId;
    @Column(name = "f_group_id") private int fgroupId;
    @Column(name = "trnsp") private int trnsp;
    @Column(name = "at_spot_id") private int atspotId;
    @Column(name = "user_place") private String place;

    public Users()
    {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPublicId() {
        return publicId;
    }

    public void setPublicId(int publicId) {
        this.publicId = publicId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public int getFrnds() {
        return frnds;
    }

    public void setFrnds(int frnds) {
        this.frnds = frnds;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBday() {
        return bday;
    }

    public void setBday(Date bday) {
        this.bday = bday;
    }

    public int getInterestId() {
        return interestId;
    }

    public void setInterestId(int interestId) {
        this.interestId = interestId;
    }

    public int getFgroupId() {
        return fgroupId;
    }

    public void setFgroupId(int fgroupId) {
        this.fgroupId = fgroupId;
    }

    public int getTrnsp() {
        return trnsp;
    }

    public void setTrnsp(int trnsp) {
        this.trnsp = trnsp;
    }

    public int getAtspotId() {
        return atspotId;
    }

    public void setAtspotId(int atspotId) {
        this.atspotId = atspotId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
}