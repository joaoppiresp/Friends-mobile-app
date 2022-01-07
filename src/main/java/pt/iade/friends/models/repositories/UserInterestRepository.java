package pt.iade.friends.models.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.friends.models.UserInterest;
import pt.iade.friends.models.Views.UserInterestView;

public interface UserInterestRepository extends CrudRepository<UserInterest, Integer> 
{
    String getUserInteNm = " SELECT user_inte_id AS id, int_type AS interest "+
    "FROM users "+
    "INNER JOIN userinterest ON users.user_id=userinterest.users_fk "+
    "INNER JOIN interests ON userinterest.int_fk=interests.interest_id ";

    @Query(value= getUserInteNm + "AND userinterest.users_fk=:usersFk", nativeQuery = true)
    Iterable<UserInterestView> filterNm(@Param("usersFk")int usersFk);
}
