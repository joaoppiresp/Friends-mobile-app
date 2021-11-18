package pt.iade.friends.models;

import java.sql.Date;

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
    @Column(name = "evnt_date") Date evntDate;
    @Column(name = "event_type_id") private int evntTpId;
    @Column(name = "spot_id") private int sptId;
    @Column(name = "evnttype_id") private int evntTypeId;
    
    public SpotEvents() {
        //empty constructor
    }

    public Date getEvntDate(){return evntDate;}
    public int getEvntTypeId(){return evntTpId;}
    public int getSpotId(){return sptId;}
    public int getEvntTpId(){return evntTypeId;}
}