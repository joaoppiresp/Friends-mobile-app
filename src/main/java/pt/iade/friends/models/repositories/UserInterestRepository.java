package pt.iade.friends.models.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pt.iade.friends.models.UserInterest;
import pt.iade.friends.models.Views.UserInterestView;

public interface UserInterestRepository extends CrudRepository<UserInterest, Integer> 
{
    String getUserInterestQuery = "Select user_nm AS NAME, " +
    "int_type AS INTEREST " +
    "from users, userinterest, interests " +
    "where users_fk = user_id and " +
    "int_fk = interest_id ";
    
    //interests with names
    @Query(value = getUserInterestQuery, nativeQuery = true)
    Iterable<UserInterestView> filtername(@Param("name") int name);
}
