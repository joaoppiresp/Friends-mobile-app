package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "spotevents")
public class SpotEvent 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spot_evnt_id") private int evntId;
    @Column(name = "evnt_date") private Timestamp evntDate;
    @Column(name = "event_name") private String eventNm;
    @Column(name = "spot_fk") private int spotFK;
    @Column(name = "evnttype_fk ") private int evntTypeFK;
   
    public SpotEvent(){//empty const.
    };

    public int getevntId() {return evntId;}
    public Timestamp getevntDate() {return evntDate;}
    public String getevntNm() {return eventNm;}
    public int getspotFK() {return spotFK;}
    public int getevntTypeFK(){return evntTypeFK;}
}
