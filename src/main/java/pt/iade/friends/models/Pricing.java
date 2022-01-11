package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


@Entity
@Table(name = "pricing")
public class Pricing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prctype_fk") private int prctypeFk;
    @Column(name = "price") private BigDecimal price;
    @Column(name = "spot_fk") private int spotId;

    public Pricing(){};

    public BigDecimal getprice(){return price;}
    public int getprctypeFk(){return prctypeFk;}
    public int getspotFk(){return spotId;}
}
