package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Pricing;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

public interface PricingRepository extends CrudRepository<Pricing, Integer> {
 
    String getpricesQuery = "Select price, "+
    "prc_type AS type, "+
    "infospot.spot_name AS spotName "+
    "From pricing "+
    "Inner Join infospot on pricing.spot_fk = infospot.spot_id";

    //prices by spotname
    @Query(value=getpricesQuery, nativeQuery = true)
    Iterable<Pricing> filterSpotNm(@Param("spot_name") String name);
}
