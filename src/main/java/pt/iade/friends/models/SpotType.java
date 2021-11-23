package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spottype")
public abstract class SpotType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spt_id") private int sptTypeId;
    @Column(name = "spot_type") private String sptType;

    protected SpotType(){}
    public String getsptType() {
        return sptType;
    }
    public int getsptTypeId() {
        return sptTypeId;
    }

}
