package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spottypet")

public class spottype {
    @Column(name = "spot_type")
    private String spot_type;
    @Column(name = "spt_type_id")
    private int spt_type_id;

    public spottype(String spot_type, int spt_type_id) {
        this.spot_type = spot_type;
        this.spt_type_id = spt_type_id;
    }

    public String getSpot_Type() {
        return spot_type;
    }

    public void setSpot_Type(String spot_type) {
        this.spot_type = spot_type;
    }

    public int getSpt_Type_Id() {
        return spt_type_id;
    }

}
