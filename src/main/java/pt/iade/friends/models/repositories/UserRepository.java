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

    String updatePhoneNumber = "UPDATE users SET user_phone_number=:phoneNumber WHERE user_id=:userId";

    String updateName = "UPDATE users SET user_nm=:nm WHERE user_id=:userId";

    String updatePlace = "UPDATE users SET user_place=:place WHERE user_id=:userId";

    String updatePassword = "UPDATE users SET user_password=:password WHERE user_id=:userId";


    Optional<User> findByNm(String nm);
    Optional<User> findByEmail(String email);
    User findByNmAndPassword(String nm, String password);
    
    //changing email
    @Modifying @Transactional(readOnly = false)
    @Query(value=updateEmail, nativeQuery=true)
    Integer changingEmail(@Param("email") String email, @Param("userId") int userId);

    //changing phone number
    @Modifying @Transactional(readOnly = false)
    @Query(value=updatePhoneNumber, nativeQuery=true)
    Integer changingPhoneNumber(@Param("phoneNumber") String phoneNumber, @Param("userId") int userId);

    //changing user name
    @Modifying @Transactional(readOnly = false)
    @Query(value=updateName, nativeQuery=true)
    Integer changingUserName(@Param("nm") String nm, @Param("userId") int userId);

    //changing place
    @Modifying @Transactional(readOnly = false)
    @Query(value=updatePlace, nativeQuery=true)
    Integer changingUserPlace(@Param("place") String place, @Param("userId") int userId);

    //changing password
    @Modifying @Transactional(readOnly = false)
    @Query(value=updatePassword, nativeQuery=true)
    Integer changingUserPassword(@Param("password") String password, @Param("userId") int userId);
}
