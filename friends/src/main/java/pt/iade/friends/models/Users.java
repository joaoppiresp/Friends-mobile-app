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

public class Users 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_email") private String user_email;
    @Column(name = "user_phone_number") private String user_phone_number;
    @Column(name = "user_public_id") private int user_public_id;
    @Column(name = "user_db_id") private int user_db_id;
    @Column(name = "user_nm") private String user_nm;
    @Column(name = "frnds") private int frnds;
    @Column(name = "user_bday") private DateTimeOffset user_bday;
    @Column(name = "user_interest_id") private int user_interest_id;
    @Column(name = "f_group_id") private int f_group_id;
    @Column(name = "trnsp") private int trnsp;
    @Column(name = "at_spot_id") private int at_spot_id;
    @Column(name = "user_place") private String user_place;

    public Users()
    {

    }

    public String getUser_Email() {return user_email;}
    public String getUser_Phone_Number() {return user_phone_number;}
    public int getUser_Public_id() {return user_public_id;}
    public int getUser_Db_Id() {return user_db_id;}
    public String getUser_Nm() {return user_nm;}
    public int getFrnds() {return frnds;}
    public DateTimeOffset getUser_Bday() {return user_bday;}
    public int getUser_Interest_Id() {return user_interest_id;}
    public int getF_Group_Id() {return f_group_id;}
    public int get_Trnsp() {return trnsp;}
    public int getAt_Spot_Id() {return at_spot_id;}
    public String getUser_Place() {return user_place;}
}