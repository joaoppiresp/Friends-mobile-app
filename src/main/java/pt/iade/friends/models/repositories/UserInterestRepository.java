package pt.iade.friends.models.repositories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pt.iade.friends.models.UserInterest;
import pt.iade.friends.models.Views.UserInterestView;

public interface UserInterestRepository extends CrudRepository<UserInterest, Integer> 
{
    String getUserInterestQuery = " int_type AS Interest "+ 
    "FROM interests "+ 
    "Inner Join interests ON userinterest.int_fk=interests.interest_id";

    @Query(value =getUserInterestQuery + "WHERE userinterests.int_fk=:intFk", nativeQuery = true)
    Iterable<UserInterestView> filterUserInterest(@Param("intFk") int intFk);
    
}
