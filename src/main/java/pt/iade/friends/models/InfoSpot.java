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
    @Column(name = "spot_id") private int spotId;
    @Column(name = "spot_name") private String name;
    @Column(name = "contact_info") private String contactInfo;
    @Column(name = "spot_address") private String spotAddress;
    @Column(name = "spttype_fk") private int sptType;


    public InfoSpot() {}
   
    public String getsptname() {return name;}
    public int getId() {return spotId;}
    public String getContactInfo() {return contactInfo;}
    public String getsptaddress() {return spotAddress;}
    public int getSpotType() {return sptType;}

}
