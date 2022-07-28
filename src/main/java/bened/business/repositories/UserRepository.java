package bened.business.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import bened.business.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
