package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import microsoft.sql.DateTimeOffset;

@Entity
@Table(name = "transp_type")

public class transp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trnsp_type")
    private String trnsp_type;
    @Column(name = "schedual")
    private DateTimeOffset schedual;
    @Column(name = "internal_id")
    private int internal_id;

    public transp(String trnsp_type, DateTimeOffset schedual, int internal_id) {
        this.trnsp_type = trnsp_type;
        this.schedual = schedual;
        this.internal_id = internal_id;
    }

    public String getTrnsp_type() {
        return trnsp_type;
    }

    public DateTimeOffset getSchedual() {
        return schedual;
    }

    public int getInternal_id() {
        return internal_id;
    }
}
