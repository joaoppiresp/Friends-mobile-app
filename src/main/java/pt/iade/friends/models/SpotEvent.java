package pt.iade.friends.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import java.sql.Timestamp;

@Entity
@Table(name = "spotevents")
public class SpotEvent 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spot_evnt_id") public int evntId;
    @Column(name = "evnt_date") public Timestamp evntDate;
    @Column(name = "event_name") public String eventNm;
    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=InfoSpot.class )
    @JoinColumn(name="spot_fk") public int spotFK;
    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=Eventtype.class )
    @JoinColumn(name = "evnttype_fk ") public int evntTypeFK;
   
    public SpotEvent(){//empty const.
    };

    public int getevntId() {return evntId;}
    public Timestamp getevntDate() {return evntDate;}
    public String getevntNm() {return eventNm;}
    public int getspotFK() {return spotFK;}
    public int getevntTypeFK(){return evntTypeFK;}
}
