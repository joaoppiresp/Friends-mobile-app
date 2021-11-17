package pt.iade.friends.models;
import java.math.BigDecimal;
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
    @Column(name = "user_email") private String userEmail;
    @Column(name = "user_phone_number") private String userPhoneNumber;
    @Column(name = "user_public_id") private int userPublicId;
    @Column(name = "user_db_id") private int id;
    @Column(name = "user_nm") private String userNm;
    @Column(name = "frnds") private int friendsId;
    @Column(name = "user_bday") private BigDecimal userBday;
    @Column(name = "user_interest_id") private int userInterestId;
    @Column(name = "f_group_id") private int fGroupId;
    @Column(name = "trnsp") private int trnspId;
    @Column(name = "at_spot_id") private int atSpotId;
    @Column(name = "user_place") private String userPlace;

    public Users()
    {
    }

    public String getUserEmail() {return userEmail;}
    public String getUserPhoneNumber() {return userPhoneNumber;}
    public int getUserPublicId() {return userPublicId;}
    public int getId() {return id;}
    public String getUserNm() {return userNm;}
    public int getFrnds() {return friendsId;}
    public BigDecimal getUserBday() {return userBday;}
    public int getUserInterestId() {return userInterestId;}
    public int getFGroupId() {return fGroupId;}
    public int getTrnsp() {return trnspId;}
    public int getAtSpotId() {return atSpotId;}
    public String getUserPlace() {return userPlace;}
}