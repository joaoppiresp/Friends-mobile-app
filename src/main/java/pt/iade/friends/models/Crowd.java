package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "crowd")
public class Crowd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crwd_id") public int crwdId;
    @Column(name = "crwd_date_milis") public double dateTime;
    @Column(name = "crwd_lat") public double crwdLat;
    @Column(name = "crwd_long") public double crwdLong;
    @Column(name = "user_fk") public int userFk;
    @Column(name = "spt_fk") public int spotFk;

    public Crowd(){};

    public int getCrwdId(){return crwdId;}
    public double getCrwdDateTime(){return dateTime;}
    public double getCrwdLat(){return crwdLat;}
    public double getCrwdLong(){return crwdLong;}
    public int getUserFk(){return userFk;}
    public int getSpotFk(){return spotFk;}
    
}
