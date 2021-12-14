package pt.iade.friends.models.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.User;

public interface UserRepository extends CrudRepository<User, Integer> 
{
    Optional<User> findByNm(String nm);
    Optional<User> findByEmail(String email);
}
