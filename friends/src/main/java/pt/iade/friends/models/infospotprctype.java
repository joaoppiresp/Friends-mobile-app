package pt.iade.friends.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "infospotprctype")

public class InfoSpotPrcType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "price_id")
    private int price_id;
    @Column(name = "prc_type")
    private int prc_type;
    @Column(name = "spot_id")
    private int spot_id;

    public InfoSpotPrcType() {
    }
    /*
     * public infospotprctype(BigDecimal price, int price_id, int prc_type, int
     * spot_id) { this.price = price; this.price_id = price_id; this.prc_type =
     * prc_type; this.spot_id = spot_id; }
     */
    
    public BigDecimal getPrice() {return price;}
    public int getPrice_Id() {return price_id;}
    public int prc_type() {return prc_type;}
    public int getSpot_Id() {return spot_id;}

}
