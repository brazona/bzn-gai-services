package br.brazona.bzn_gai_services_user.infra.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.brazona.bzn_gai_services_user.infra.entities.UserEntity;

/**
*
* Interface class for connecting to table database [ RolesRepository ]
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/
@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Long> {
}
