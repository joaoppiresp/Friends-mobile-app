package pt.iade.friends.models.repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import pt.iade.friends.models.User;

public interface UserRepository extends CrudRepository<User, Integer> 
{
    String updateEmail = "UPDATE users SET user_email=:email WHERE user_id=:userId";

    Optional<User> findByNm(String nm);
    Optional<User> findByEmail(String email);
    User findByNmAndPassword(String nm, String password);

    //changing email
    @Modifying @Transactional(readOnly = false)
    @Query(value=updateEmail, nativeQuery=true)
    Integer changingEmail(@Param("email") String email, @Param("userId") int userId);

}
