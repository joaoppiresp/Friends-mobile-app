package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import microsoft.sql.DateTimeOffset;

@Entity
@Table(name = "spotevents")

public class spotevents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evnt_date")
    private DateTimeOffset evnt_date;
    @Column(name = "event_type_id")
    private int event_type_id;
    @Column(name = "spot_id")
    private int spot_id;
    @Column(name = "evnttype_id")
    private int evnttype_id;

    public spotevents() {
    }
    /*
     * public spotevents(DateTimeOffset evnt_date, int event_type_id, int spot_id,
     * int evnttype_id) { this.evnt_date = evnt_date; this.event_type_id =
     * event_type_id; this.spot_id = spot_id; this.evnttype_id = evnttype_id; }
     */

    public int getEvent_Type_Id() {
        return event_type_id;
    }

    public int getSpot_Id() {
        return spot_id;
    }

    public int getEvnttype_Id() {
        return evnttype_id;
    }

}
