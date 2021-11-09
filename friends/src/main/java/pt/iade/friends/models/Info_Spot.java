package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="info_spot")


public class Info_Spot 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="spot_name") private String name;
    @Column(name="internal_id") private int internal_id;
    @Column(name="contact_info") private String contact_info;
    @Column(name="address") private String address;
    @Column(name="spt_type") private String type;
    @Column(name="price") private double price;
    


    
    
    public Info_Spot() 
{

}
    public String getName(){return name;}
    public int getInternal_id(){return internal_id;}
    public String getContact_info(){return contact_info;}
    public String getAddress(){return address;}
    public String getType(){return type;}
    public double getPrice(){return price;}

}
