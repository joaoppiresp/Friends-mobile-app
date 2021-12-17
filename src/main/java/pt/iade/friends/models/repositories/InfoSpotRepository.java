package pt.iade.friends.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.friends.models.Views.InfoSpotView;
import pt.iade.friends.models.Views.InfoSpotView2;
import pt.iade.friends.models.InfoSpot;
public interface InfoSpotRepository extends CrudRepository<InfoSpot, Integer> 
{   
    String getSpotIdentifiersQuery = "SELECT spot_name AS sptName FROM infospot ";
    String getSpotInfoQuery = "SELECT spot_name AS sptName, spot_address AS sptAddress, contact_info AS sptContactInfo FROM infospot ";
    
    //getting Identifiers
    @Query(value=getSpotIdentifiersQuery + "WHERE infospot.spot_id >=:spotId", nativeQuery=true)
    Iterable<InfoSpotView> getAllIdentifiers(@Param("spotId") int spotId);

    //getting Info for searchView
    @Query(value=getSpotInfoQuery + "WHERE infospot.spot_name =:name", nativeQuery=true)
    Iterable<InfoSpotView2> getSpotInfo(@Param("name") String name);



}