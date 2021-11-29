package pt.iade.friends.models.repositories;
import java.util.Optional;
import java.sql.Timestamp;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.SpotEvent;
import pt.iade.friends.models.Views.SpotEventView;
public interface SpotEventRepository extends CrudRepository<SpotEvent, Integer>{

    String getEvntQuery = "Select price AS price, " +
    "infospot.spot_name AS sptName, "+
    "infospot.spot_address AS sptaddress, "+ 
    "date_part('year', evnt_date) AS evyear, date_part('month', evnt_date) AS evmonth, date_part('day', evnt_date) AS evday, "+
    "date_part('hour', evnt_date) AS evhour, date_part('minute', evnt_date) AS evmin, "+
    "eventtype.evnt_type AS type "+
    "From pricing "+
    "Inner Join infospot on pricing.spot_fk = infospot.spot_id "+
    "Inner Join spotevents on infospot.spot_id=spotevents.spot_fk "+
    "Inner Join eventtype on spotevents.evnttype_fk=eventtype.evnt_id ";

    //events by spot id
    @Query(value=getEvntQuery + "WHERE spotevents.spot_fk=:spotFK", nativeQuery=true)
    Iterable<SpotEventView> filtersptId(@Param("spotFK") int spotFK);

    //events by eventtype
    @Query(value=getEvntQuery + " WHERE eventtype.evnt_id=:evntTypeFK ", nativeQuery = true)
    Iterable<SpotEventView> filterType(@Param("evntTypeFK") int evntTypeFK);

    //events by spot name
    @Query(value=getEvntQuery + " WHERE infospot.spot_name=:name", nativeQuery = true)
    Iterable<SpotEventView> filterSptNm(@Param("name") String name);

    //events by event name
    @Query(value=getEvntQuery + " WHERE spotevents.event_name=:eventNm", nativeQuery = true)
    Iterable<SpotEventView> filterEvntNm(@Param("eventNm") String eventNm);

}


/*
    //events by date
    String byDateQuery = getEvntQuery + " WHERE spotevents.evnt_date= :evntdate";
    @Query(value=byDateQuery, nativeQuery = true)
    Iterable<SpotEvent> filterDate(@Param(value="evntdate") Timestamp evntdate);

    //events by spotname & eventdate
    String byNmDateQuery = getEvntQuery + " WHERE infospot.spot_name= :name AND spotevents.evnt_date= :evntdate";
    @Query(value=byNmDateQuery, nativeQuery = true)
    Iterable<SpotEvent> filterSptNameDate(@Param(value="name") String name, @Param(value="evntdate") Timestamp evntdate);
*/

