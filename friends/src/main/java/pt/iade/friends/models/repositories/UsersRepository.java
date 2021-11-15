package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> 
{
    public Iterable<Users> getUsersById(int user_db_id);
    public boolean DeleteUsersById(int user_db_id);
}
