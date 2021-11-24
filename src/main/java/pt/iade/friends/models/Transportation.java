package pt.iade.friends.models;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transportation")

public class Transportation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tsp_id") private int tspId;
    @Column(name = "price") private BigDecimal price;
    @Column(name = "tsptype_fk") private int tsptypeFk;
    @Column(name = "crowd_fk") private int crowdFk;

    public Transportation(){}

    public int getTspId() {return tspId;}
    public BigDecimal getPrice() {return price;}
    public int getTsptypeFk() {return tsptypeFk;}
    public int getCrowdFk() {return crowdFk;}
    
}
