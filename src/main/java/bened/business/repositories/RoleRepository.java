package bened.business.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import bened.business.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
