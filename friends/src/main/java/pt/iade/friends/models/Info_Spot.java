package pt.iade.friends.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "info_spot")

public class Info_Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spot_name")
    private String name;
    @Column(name = "internal_id")
    private int internal_id;
    @Column(name = "contact_info")
    private String contact_info;
    @Column(name = "address")
    private String address;
    @Column(name = "spt_type")
    private String type;
    @Column(name = "price")
    private BigDecimal price;

    public Info_Spot(String name, int internal_id, String contact_info, String address, String type, BigDecimal price) {
        this.name = name;
        this.internal_id = internal_id;
        this.contact_info = contact_info;
        this.address = address;
        this.type = type;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public int getInternal_id() {
        return internal_id;
    }

    public String getContact_info() {
        return contact_info;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
