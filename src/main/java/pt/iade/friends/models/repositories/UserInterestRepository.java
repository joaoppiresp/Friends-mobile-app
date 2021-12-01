package pt.iade.friends.models.repositories;
import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.UserInterest;

public interface UserInterestRepository extends CrudRepository<UserInterest, Integer> 
{
    String getInterestQuery = " Select user_nm AS Name, " +
    " interests AS Interest, " +
    " From userinterest " +
    " Inner join users on users_fk = user_id " +
    " Inner join interests on int_fk = interest_id " +
    " group by user_nm, interests ";
}
