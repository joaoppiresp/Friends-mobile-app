package pt.iade.friends.models.repositories;
import java.util.Optional;
import java.sql.Timestamp;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.SpotEvent;
public interface SpotEventRepository extends CrudRepository<SpotEvent, Integer>{

    String getEvntQuery = "Select price, "+
    "infospot.spot_name, "+
    "infospot.spot_address AS sptaddress, "+ 
    "date_part('year', evnt_date) AS evyear, date_part('month', evnt_date) AS evmonth, date_part('day', evnt_date) AS evday, "+
    "date_part('hour', evnt_date) AS evhour, date_part('minute', evnt_date) AS evmin, "+
    "eventtype.evnt_type AS type "+
    "From pricing "+
    "Inner Join infospot on pricing.spot_fk = infospot.spot_id "+
    "Inner Join spotevents on infospot.spot_id=spotevents.spot_fk "+
    "Inner Join eventtype on spotevents.evnttype_fk=eventtype.evnt_id ";

    //events by id
    String testquery = "Select price, "+
    "infospot.spot_name, "+
    "infospot.spot_address AS sptaddress, "+ 
    "date_part('year', evnt_date) AS evyear, date_part('month', evnt_date) AS evmonth, date_part('day', evnt_date) AS evday, "+
    "date_part('hour', evnt_date) AS evhour, date_part('minute', evnt_date) AS evmin, "+
    "eventtype.evnt_type AS type "+
    "From pricing "+
    "Inner Join infospot on pricing.spot_fk = infospot.spot_id "+
    "Inner Join spotevents on infospot.spot_id=spotevents.spot_fk "+
    "Inner Join eventtype on spotevents.evnttype_fk=eventtype.evnt_id "+
    "WHERE spotevents.spot_fk = spotFK";

    @Query(value=testquery, nativeQuery=true)
    Iterable<SpotEvent> filtersptId(@Param(value="spotFK") int spotFK);
    /*
    String byIdQuery = getEvntQuery + "WHERE infospot.spot_id= :spotFK";
    @Query(value=byIdQuery, nativeQuery=true)
    Iterable<SpotEvent> filtersptId(@Param(value="spotFK") int spotFK);
    */

    //events by date
    String byDateQuery = getEvntQuery + " WHERE spotevents.evnt_date= :evntdate";
    @Query(value=byDateQuery, nativeQuery = true)
    Iterable<SpotEvent> filterDate(@Param(value="evntdate") Timestamp evntdate);

    //events by spotname & eventdate
    String byNmDateQuery = getEvntQuery + " WHERE infospot.spot_name= :name AND spotevents.evnt_date= :evntdate";
    @Query(value=byNmDateQuery, nativeQuery = true)
    Iterable<SpotEvent> filterSptNameDate(@Param(value="name") String name, @Param(value="evntdate") Timestamp evntdate);

    //events by eventtype
    String byTypeQuery = getEvntQuery + " WHERE eventtype.evnt_id= :evntTypeFK ";
    @Query(value=byTypeQuery, nativeQuery = true)
    Iterable<SpotEvent> filterType(@Param(value="evntTypeFK") int evntTypeFK);

    //events by eventname
    Optional <SpotEvent> findByeventNm(String eventNm);
}

/*
    
    String byNmQuery = getEvntQuery + " WHERE infospot.spot_name= :name";
    @Query(value=byNmQuery, nativeQuery = true)
    Iterable<SpotEvent> filterSptNm(@Param(value="name") String name);

*/
/*
    String byEvNmQuery = getEvntQuery + " WHERE spotevents.event_name= :evntNm";
    @Query(value=byEvNmQuery, nativeQuery = true)
    Iterable<SpotEvent> filterEvntNm(@Param(value="evntNm") String evntNm);

*/

/*
    //events by spotname
    Optional<SpotEvent> findByname(String name );

*/