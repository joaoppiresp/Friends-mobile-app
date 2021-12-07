package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Pricing;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import pt.iade.friends.models.Views.SpotEventView;
public interface PricingRepository extends CrudRepository<Pricing, Integer> {
    
    String getpricesQuery = "SELECT pricetype.prc_type AS type, "+
    "pricing.price AS amount, "+
    "infospot.spot_name AS spotName "+
    "From pricetype "+
    "Inner Join pricing on pricetype.prc_id=pricing.prctype_fk "+
    "Inner Join infospot on pricing.spot_fk=infospot.spot_id "+
    "WHERE spotevents.spot_fk=:spotId";

    //prices by spot id
    @Query(value=getpricesQuery, nativeQuery = true)
    Iterable<SpotEventView> filterSpotId(@Param( "spotId") int spotId);
}
