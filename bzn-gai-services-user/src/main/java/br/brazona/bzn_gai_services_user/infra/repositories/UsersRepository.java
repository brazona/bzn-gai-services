package br.brazona.bzn_gai_services_user.infra.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.brazona.bzn_gai_services_user.infra.entities.UserEntity;

/**
 * Interface que representa o repositório de usuários.
 * @author Brazona Tech
 * @version 1.0.0
 * @since release 1.0.0
 */
@Repository
public interface UsersRepository extends CrudRepository<UserEntity, Long> {
}
