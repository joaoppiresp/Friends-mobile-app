package pt.iade.friends.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tspuserspot")

public class TspUserSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "tsp_type_id")
    private int tsp_type_id;
    @Column(name = "tsp_spot_id")
    private int tsp_spot_id;
    @Column(name = "tsp_id")
    private int tsp_id;

    public TspUserSpot() {}
    /*
     * public tspuserspot(BigDecimal price, int tsp_type_id, int tsp_spot_id, int
     * tsp_id) { this.price = price; this.tsp_type_id = tsp_type_id;
     * this.tsp_spot_id = tsp_spot_id; this.tsp_id = tsp_id; }
     */

    public BigDecimal getPrice() {return price;}
    public int getTsp_Type_Id() {return tsp_type_id;}
    public int getTsp_Spot_Id() {return tsp_spot_id;}
    public int getTsp_Id() {return tsp_id;}
}
