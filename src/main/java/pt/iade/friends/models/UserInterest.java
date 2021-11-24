package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "userinterests")

public class UserInterest 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_int_id") private int intId;
    @Column(name = "users_fk") private int usersFk;
    @Column(name = "int_fk") private int intFk;

    public UserInterest(){}

    public int getUserIntId(){return intId;}
    public int getIntFk(){return intFk;}
    @JsonIgnore
    public int getUsersFk(){return usersFk;}
}
