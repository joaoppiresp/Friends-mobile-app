package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InfoSpot")

public class InfoSpot 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spot_name") private String name;
    @Column(name = "spot_db_id") private int id;
    @Column(name = "contact_info") private String contactInfo;
    @Column(name = "spot_address") private String spotAddress;
    @Column(name = "spt_type") private int sptType;
    @Column(name = "spt_info_prc_id") private int sptInfoPrcId;
    @Column(name = "evnt_id") private int evntId;
    @Column(name = "crowd_spot_id") private int crowdSpotId;

    public InfoSpot() {}
    
    public String getSpot_Name() {return name;}
    public int getSpot_db_id() {return id;}
    public String getContact_info() {return contactInfo;}
    public String getSpot_Address() {return spotAddress;}
    public int getSpt_Type() { return sptType;}
    public int getSpt_Info_Prc_Id() {return sptInfoPrcId;}
    public int getEvnt_Id(){return evntId;}
    public int getCrowd_Spot_Id() {return crowdSpotId;}
}
