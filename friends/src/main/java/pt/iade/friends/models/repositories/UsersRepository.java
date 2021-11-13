package pt.iade.friends.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.friends.models.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> 
{
    public Iterable<Users> getUsersById(int internal_id);
    public boolean deleteUsersById(int internal_id);
}
