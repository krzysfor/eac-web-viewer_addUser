package pl.currenda.eac.web.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.currenda.eac.web.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
