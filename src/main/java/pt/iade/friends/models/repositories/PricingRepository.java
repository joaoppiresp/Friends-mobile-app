package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Pricing;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

public interface PricingRepository extends CrudRepository<Pricing, Integer> {
    //TODO: REVER ESTA QUERY
    String getpricesQuery = "SELECT pricetype.prc_type AS type, "+
    "pricing.price AS amount, "+
    "infospot.spot_name AS spotName "+
    "From pricetype "+
    "Inner Join pricing on pricetype.prc_id=pricing.prctype_fk "+
    "Inner Join infospot on pricing.spot_fk=infospot.spot_id "+
    "WHERE pricing.spot_fk = ?1";

    //prices by spot id
    @Query(value=getpricesQuery, nativeQuery = true)
    Iterable<Pricing> filterSpotId(@Param(value= "spotId") int spotId);
}
