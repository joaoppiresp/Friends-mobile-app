package pt.iade.friends.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "spotevents")
public class SpotEvent 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spot_evnt_id") public int evntId;
    @Column(name = "evnt_date") public LocalDateTime evntDate;
    @Column(name = "event_name") public String eventNm;
    @Column(name = "spot_fk") public int spotFK;
    @Column(name = "evnttype_fk ") public int evntTypeFK;
   
    public SpotEvent(){//empty const.
    };

    public int getevntId() {return evntId;}
    public LocalDateTime getevntDate() {return evntDate;}
    public String getevntNm() {return eventNm;}
    public int getspotFK() {return spotFK;}
    public int getevntTypeFK(){return evntTypeFK;}
}
