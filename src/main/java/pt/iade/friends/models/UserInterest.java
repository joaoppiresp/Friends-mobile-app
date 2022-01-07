package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userinterest")

public class UserInterest 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_inte_id") public int inteId;
    @Column(name = "int_fk") public int intFk;
    @Column(name = "users_fk") public int usersFk ;

    public UserInterest(){};

    public int getInteId(){return inteId;}
    public int getIntFk(){return intFk;}
    public int getUsersFk(){return usersFk;}    
}
