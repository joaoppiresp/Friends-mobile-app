package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interests")

public class interests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_name")
    private String int_name;
    @Column(name = "interest_id")
    private int interest_id;

    public interests(String int_name, int interest_id) {
        this.int_name = int_name;
        this.interest_id = interest_id;
    }

    public String getInt_Name() {
        return int_name;
    }

    public void setInt_Name(String int_name) {
        this.int_name = int_name;
    }

    public int getInterest_Id() {
        return interest_id;
    }

}
