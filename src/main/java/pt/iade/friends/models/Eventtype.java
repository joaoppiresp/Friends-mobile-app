package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventtype")
public class Eventtype {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evnt_type_id") private int evntId;
    @Column(name = "evnt_type") private String evntTp;

    public Eventtype(){}

    public int getEvntId(){return evntId;}
    public String getEvnTp(){return evntTp;}

}
