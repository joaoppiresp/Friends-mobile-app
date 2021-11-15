package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventtype")

public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evnt_type")
    private String evnt_type;
    @Column(name = "evnt_type_id")
    private int evnt_type_id;

    public EventType() {}
    /*
     * public eventtype(String evnt_type, int evnt_type_id) { this.evnt_type =
     * evnt_type; this.evnt_type_id = evnt_type_id; }
     */
    public String getEvent_Type() {return evnt_type;}
    public int getEvnt_Type_Id() {return evnt_type_id;}
}
