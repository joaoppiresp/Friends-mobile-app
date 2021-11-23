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
    @Column(name = "user_id") private int id;
    @Column(name = "user_email") private String email;
    @Column(name = "user_phone_number") private String phoneNumber;
    @Column(name = "user_public_id") private int publicId;
    @Column(name = "user_nm") private String nm;
    @Column(name = "user_place") private String place;

    public User(){}

    public String getEmail() {return email;}
    public String getPhoneNumber() {return phoneNumber;}
    public int getPublicId() {return publicId;}
    public int getId() {return id;}
    public String getNm() {return nm;}
    public String getPlace() {return place;}
}