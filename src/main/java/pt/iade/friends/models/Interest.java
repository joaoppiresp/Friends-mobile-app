package pt.iade.friends.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interests")

public class Interest 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interest_id") public int interestId;
    @Column(name = "int_type") public String intType;

    public Interest(){}

    public int getInterestId(){return interestId;}
    public String getIntType(){return intType;}
}
