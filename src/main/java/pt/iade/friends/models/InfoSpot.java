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
    @Column(name = "spot_id") public int spotId;
    @Column(name = "spot_name") public String name;
    @Column(name = "contact_info") public String contactInfo;
    @Column(name = "spot_address") public String spotAddress;
    @Column(name = "spttype_fk") public int sptType;
    @Column(name = "spot_lat") public Float sptLat;
    @Column(name = "spot_long") public Float sptLong;


    public InfoSpot() {}
   
    public String getSptName() {return name;}
    public int getId() {return spotId;}
    public String getContactInfo() {return contactInfo;}
    public String getSptAddress() {return spotAddress;}
    public int getSpotType() {return sptType;}
    public Float getSptLat(){return sptLat;}
    public Float getSptLong(){return sptLong;}

}
