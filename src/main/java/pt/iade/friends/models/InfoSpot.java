package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "infospot")

public class InfoSpot 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spot_name") private String name;
    @Column(name = "spot_db_id") private int spotId;
    @Column(name = "contact_info") private String contactInfo;
    @Column(name = "spot_address") private String spotAddress;
    @Column(name = "spt_type") private int sptType;
    @Column(name = "spt_info_prc_id") private int sptInfoPrcId;
    @Column(name = "evnt_id") private int evntId;
    @Column(name = "crowd_spot_id") private int crowdSpotId;

    public InfoSpot() {
        //empty constructor
    }
    
    public String getName() {return name;}
    public int getId() {return spotId;}
    public String getContactInfo() {return contactInfo;}
    public String getSpotAddress() {return spotAddress;}
    public int getSptType() { return sptType;}
    public int getSptInfoPrcId() {return sptInfoPrcId;}
    public int getEvntId(){return evntId;}
    public int getCrowdSpotId() {return crowdSpotId;}
}
