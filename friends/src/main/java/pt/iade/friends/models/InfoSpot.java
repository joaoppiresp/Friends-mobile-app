package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.boot.context.properties.ConstructorBinding;

@Entity
@Table(name = "infospot")

public class InfoSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spot_name")
    private String spot_name;
    @Column(name = "spot_db_id")
    private int spot_db_id;
    @Column(name = "contact_info")
    private String contact_info;
    @Column(name = "spot_address")
    private String spot_address;
    @Column(name = "spt_type")
    private int spt_type;
    @Column(name = "spt_info_prc_id")
    private int spt_info_prc_id;
    @Column(name = "evnt_id")
    private int evnt_id;
    @Column(name = "crowd_spot_id")
    private int crowd_spot_id;

    public InfoSpot() {
    }
    /*
     * public InfoSpot(String spot_name, int spot_db_id, String contact_info, String
     * spot_address, int spt_type, int spt_info_prc_id, int evnt_id, int
     * crowd_spot_id) { this.spot_name = spot_name; this.spot_db_id = spot_db_id;
     * this.contact_info = contact_info; this.spot_address = spot_address;
     * this.spt_type = spt_type; this.spt_info_prc_id = spt_info_prc_id;
     * this.evnt_id = evnt_id; this.crowd_spot_id = crowd_spot_id;
     * 
     * }
     */
    
    public String getSpot_Name() {return spot_name;}
    public int getSpot_db_id() {return spot_db_id;}
    public String getContact_info() {return contact_info;}
    public String getSpot_Address() {return spot_address;}
    public int getSpt_Type() { return spt_type;}
    public int getCrowd_Spot_Id() {return crowd_spot_id;}

}
