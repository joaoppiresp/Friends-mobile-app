package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import microsoft.sql.DateTimeOffset;

@Entity
@Table(name = "crowd")

public class Crowd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crwd_date")
    private DateTimeOffset crwd_date;
    @Column(name = "crwd_id")
    private int crowd_id;
    @Column(name = "user_ids")
    private int user_ids;
    @Column(name = "spt_id")
    private int spt_id;

    public Crowd() {
    }  
    /*
     * public crowd(DateTimeOffset crwd_date, int crowd_id, int user_ids, int
     * spt_id) { this.crwd_date = crwd_date; this.crowd_id = crowd_id; this.user_ids
     * = user_ids; this.spt_id = spt_id; }
     */
    public DateTimeOffset getCrwd_Date() {return crwd_date;}
    public int getCrowd_Id() {return crowd_id;}
    public int getUser_Ids() {return user_ids;}
    public int getSpt_Id() {return spt_id;}

}
