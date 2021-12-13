package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") private int userId;
    @Column(name = "user_email") private String email;
    @Column(name = "user_phone_number") private String phoneNumber;
    @Column(name = "user_public_id") private int publicId;
    @Column(name = "user_nm") private String nm;
    @Column(name = "user_place") private String place;
    @Column(name = "user_password") private String password;

    public User(){}

    public int getId() {return userId;}
    public String getEmail() {return email;}
    public String getPhoneNumber() {return phoneNumber;}
    public int getPublicId() {return publicId;}
    public String getNm() {return nm;}
    public String getPlace() {return place;}
    public String getPassword(){return password;}
}