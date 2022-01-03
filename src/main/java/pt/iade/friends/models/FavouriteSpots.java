package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "favouritespots")
public class FavouriteSpots {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_fk") private int userFK;
    @Column(name = "spot_fk") private int spotFK;

    public FavouriteSpots(){}

    public int getUserFk(){return userFK;}
    public int getSpotFk(){return spotFK;}

}
