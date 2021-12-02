package pt.iade.friends.models.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pt.iade.friends.models.UserInterest;
import pt.iade.friends.models.Views.UserInterestView;

public interface UserInterestRepository extends CrudRepository<UserInterest, Integer> 
{
    String getUserInterestQuery = " Select user_nm AS Name, " +
    " interests AS Interest, " +
    " From userinterest " +
    " Inner join users on users_fk = user_id " +
    " Inner join interests on int_fk = interest_id " +
    " group by user_nm, interests ";

    //interest by user id
    @Query(value = getUserInterestQuery + "WHERE userinterest.users_fk=usersFk", nativeQuery = true)
    Iterable<UserInterestView> filteruserId(@Param("usersFk") int usersFk);

    //interest by interest id
    @Query(value = getUserInterestQuery + "WHERE userinterest.int_fk=intFk", nativeQuery = true)
    Iterable<UserInterestView> filterinterestId(@Param("intFk") int intFk);
}
