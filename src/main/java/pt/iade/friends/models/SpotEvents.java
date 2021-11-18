package pt.iade.friends.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spotevents")

public class SpotEvents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evnt_date") Timestamp evntDate;
    @Column(name = "event_type_id") private int evntTypeId;
    @Column(name = "spot_id") private int sptId;
    @Column(name = "evnttype_id") private int evntTpId;
    
    public SpotEvents() {
        //empty constructor
    }

    public Timestamp getEvntDate(){return evntDate;}
    public int getEvntTypeId(){return evntTypeId;}
    public int getSpotId(){return sptId;}
    public int getEvntTpId(){return evntTpId;}
}