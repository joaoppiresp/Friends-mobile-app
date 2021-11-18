package pt.iade.friends.views;
public interface EventView {


    String QueryGetEvents = "SELECT infospot.spot_name AS sptname, "+
    "infospot.spot_address AS sptaddress, "+
    "date_part('year', evnt_date) AS evyear, date_part('month', evnt_date) AS evmonth, date_part('day', evnt_date) AS evday, "+
    "date_part('hour', evnt_date) AS evhour, date_part('minute', evnt_date) AS evmin, "+
    "eventtype.evnt_type AS type "+
    "FROM infospot INNER JOIN spotevents ON infospot.spot_db_id=spotevents.spot_id "+
    "INNER JOIN eventtype ON spotevents.evnttype_id=eventtype.evnt_type_id";
}
