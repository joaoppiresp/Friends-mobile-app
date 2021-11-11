package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")


public class Users
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="email") private String email;
    @Column(name="phone_number") private int phone_number;
    @Column(name="public_id") private int public_id;
    @Column(name="internal_id") private int internal_id;
    @Column(name="user_name") private String name;
    @Column(name="likes") private String likes;
    @Column(name="status") private String status;
    @Column(name="bdate") private String bdate;
    @Column(name="gender") private char gender;

    public Users() 
{

}
    public String getEmail() {return email;}
    public int getPhone_number() {return phone_number;}
    public int getPublic_id(){return public_id;}
    public int getInternal_id(){return internal_id;}
    public String getName(){return name;}
    public String getLikes(){return likes;}
    public String getStatus() {return status;}
    public String getBdates() {return bdate;}
    public char getGender(){return gender;}

}