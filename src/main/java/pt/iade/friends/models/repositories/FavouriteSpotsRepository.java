package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.FavouriteSpots;
import pt.iade.friends.models.Views.FavouriteSpotsView;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

public interface FavouriteSpotsRepository extends CrudRepository<FavouriteSpots, Integer> {

    String getFavouritesQuery = "SELECT infospot.spot_name AS spot, "+
    "user_nm AS user "+
    "FROM favouritespots Inner Join infospot ON favouritespots.spot_fk=infospot.spot_id "+
    "Inner Join users ON favouritespots.user_fk=users.user_id";

    //events by spot id
    @Query(value=getFavouritesQuery + " WHERE favouritespots.user_fk=:userFk", nativeQuery=true)
    Iterable<FavouriteSpotsView> filterUserId(@Param("userFk") int userFk);
    
    
}
