package pt.iade.friends.models.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import pt.iade.friends.models.Eventtype;

public interface EventtypeRepository extends JpaRepository<Eventtype, Integer> 
{
    
}
