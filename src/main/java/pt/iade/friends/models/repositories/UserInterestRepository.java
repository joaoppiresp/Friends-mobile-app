package pt.iade.friends.models.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pt.iade.friends.models.UserInterest;
import pt.iade.friends.models.Views.UserInterestView;

public interface UserInterestRepository extends CrudRepository<UserInterest, Integer> 
{
    String getUserInterestQuery = "SELECT user_nm AS name, "+
    "int_type AS interest "+
    "FROM users INNER JOIN userinterest ON users.user_id=userinterest.users_fk "+
    "INNER JOIN interests ON userinterest.int_fk=interests.interest_id";


    @Query(value =getUserInterestQuery + "WHERE userinterests.users_fk=:usersFk", nativeQuery = true)
    Iterable<UserInterestView> filteruserInterestUser(@Param("usersFk") int usersFk);
    
}
