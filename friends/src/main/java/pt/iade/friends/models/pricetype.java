package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pricetype")

public class pricetype {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prc_type")
    private String prc_type;
    @Column(name = "prc_type_id")
    private int prc_type_id;

    public pricetype(String prc_type, int prc_type_id) {
        this.prc_type = prc_type;
        this.prc_type = prc_type;
    }

    public String getPrc_Type() {
        return prc_type;
    }

    public void setPrc_Type(String prc_type) {
        this.prc_type = prc_type;
    }

    public int getPrc_Type_Id() {
        return prc_type_id;
    }
}
