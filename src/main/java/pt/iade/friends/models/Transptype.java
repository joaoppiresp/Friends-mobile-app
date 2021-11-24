package pt.iade.friends.models;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transptype")

public class Transptype
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trnsp_id") private int trnspId;
    @Column(name = "scheudal") private Date scheudal;
    @Column(name = "trnsp_type") private String trnspType;

    public Transptype(){}

    public int getTrnspId() {return trnspId;}
    public Date getScheudal() {return scheudal;}
    public String getTrnspType() {return trnspType;}
    
}