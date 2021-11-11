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
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "public_id")
    private int public_id;
    @Column(name = "internal_id")
    private int internal_id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "likes")
    private String likes;
    @Column(name = "status")
    private String status;
    @Column(name = "bdate")
    private DateTimeOffset bdate;
    @Column(name = "gender")
    private char gender;

    public Users(String email, String phone_number, int internal_id, int public_id, String name, String likes,
            String status, DateTimeOffset bdate, char gender) {
        this.email = email;
        this.phone_number = phone_number;
        this.internal_id = internal_id;
        this.public_id = public_id;
        this.name = name;
        this.likes = likes;
        this.status = status;
        this.bdate = bdate;
        this.gender = gender;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getPublic_id() {
        return public_id;
    }

    public int getInternal_id() {
        return internal_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DateTimeOffset getBdates() {
        return bdate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}