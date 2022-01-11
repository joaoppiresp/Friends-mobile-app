package pt.iade.friends.models;

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
    @Column(name= "event_date_milis") public Double dateMilis;
    @Column(name = "event_name") public String eventNm;
    @Column(name = "spot_fk") public int spotFK;
    @Column(name = "evnttype_fk ") public int evntTypeFK;
   
    public SpotEvent(){//empty const.
    };

    public int getevntId() {return evntId;}
    public Double getDateMilis() {return dateMilis;}
    public String getevntNm() {return eventNm;}
    public int getspotFK() {return spotFK;}
    public int getevntTypeFK(){return evntTypeFK;}

}
