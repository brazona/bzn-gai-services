package br.brazona.bzn_gai_services.infra.repositories;

import br.brazona.bzn_gai_services.infra.entities.OrganizationsEntity;
import org.springframework.data.repository.CrudRepository;

/**
*
* Interface class for connecting to table database [ OrganizationsRepository ]
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/

public interface OrganizationsRepository extends CrudRepository<OrganizationsEntity, Long> {
}
