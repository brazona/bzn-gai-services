package br.brazona.bzn_gai_services_identity.infra.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.brazona.bzn_gai_services_identity.infra.entities.UserEntity;

/**
 * Interface que representa o repositório de usuários.
 * @author Brazona Tech
 * @version 1.0.0
 * @since release 1.0.0
 */
@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    /**
     *
     * Method that queries the user record by name.
     *
     * @param username, name that user.
     * @return UserEntity, Class Entity Users.
     *
     **/
    @Query("SELECT u FROM UserEntity u WHERE u.email =?1")
    UsersEntity findByUsername(String username);
}
