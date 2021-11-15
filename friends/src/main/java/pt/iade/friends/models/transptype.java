package pt.iade.friends.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import microsoft.sql.DateTimeOffset;

@Entity
@Table(name = "transptype")

public class transptype {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trnsp_type")
    private String trnsp_type;
    @Column(name = "schedual")
    private DateTimeOffset schedual;
    @Column(name = "type_spt_id")
    private int type_spt_id;
    @Column(name = "trnsp_id")
    private int trnsp_id;

    public transptype() {
    }
    /*
     * public transptype(String trnsp_type, DateTimeOffset schedual, int
     * type_spt_id, int trnsp_id) { this.trnsp_type = trnsp_type; this.schedual =
     * schedual; this.type_spt_id = type_spt_id; this.trnsp_id = trnsp_id; }
     */

    public String getTrnsp_type() {
        return trnsp_type;
    }

    public void setTrnsp_Type(String trnsp_type) {
        this.trnsp_type = trnsp_type;
    }

    public DateTimeOffset getSchedual() {
        return schedual;
    }

    public int getype_spt_id() {
        return type_spt_id;
    }

    public int trnsp_id() {
        return trnsp_id;
    }
}
