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
    @Column(name = "spot_name") private String spot_name;
    @Column(name = "spot_db_id") private int id;
    @Column(name = "contact_info") private String contact_info;
    @Column(name = "spot_address") private String spot_address;
    @Column(name = "spt_type") private int spt_type;
    @Column(name = "spt_info_prc_id") private int spt_info_prc_id;
    @Column(name = "evnt_id") private int evnt_id;
    @Column(name = "crowd_spot_id") private int crowd_spot_id;

    public InfoSpot() 
    {
    
    }
    
    public String getSpot_Name() {return spot_name;}
    public int getSpot_db_id() {return id;}
    public String getContact_info() {return contact_info;}
    public String getSpot_Address() {return spot_address;}
    public int getSpt_Type() { return spt_type;}
    public int getSpt_Info_Prc_Id() {return spt_info_prc_id;}
    public int getEvnt_Id(){return evnt_id;}
    public int getCrowd_Spot_Id() {return crowd_spot_id;}
}
