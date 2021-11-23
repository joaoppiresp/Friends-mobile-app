package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pricetype")
public class Pricetype {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_id") private int prctpId;
    @Column(name = "prc_type") private String prctype;

    public Pricetype(){
        //
    };

    public int getprctpid(){return prctpId;}
    public String getprctype(){return prctype;}
}
