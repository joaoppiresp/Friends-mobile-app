package pt.iade.friends.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.friends.models.Views.InfoSpotView;
import pt.iade.friends.models.InfoSpot;
public interface InfoSpotRepository extends CrudRepository<InfoSpot, Integer> 
{   
    String getSpotIdentifiersQuery = "SELECT spot_name, spot_id FROM infospot "+
                                    "WHERE infospot.spot_id >=:spotId";
    
    //getting Identifiers
    @Query(value=getSpotIdentifiersQuery + " ", nativeQuery=true)
    Iterable<InfoSpotView> getAllIdentifiers(@Param("spotId") int spotId);



}