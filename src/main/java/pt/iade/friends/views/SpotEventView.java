package pt.iade.friends.views;

import pt.iade.friends.models.repositories.EventtypeRepository;
import java.sql.Timestamp;
import pt.iade.friends.models.Eventtype;

public interface SpotEventView{
    

    //methods from Eventtype
    int getSpotId();
    //methods from InfoSpot
    int getId();
    /*method from this class
    static Timestamp getEvntDate(){return evntdate;}
    */
    


    
}
