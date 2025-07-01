package br.brazona.bzn_gai_services.infra.repositories;

import br.brazona.bzn_gai_services.infra.entities.OwnersEntity;
import org.springframework.data.repository.CrudRepository;

/**
*
* Interface class for connecting to table database [ OwnersRepository ]
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/

public interface OwnersRepository extends CrudRepository<OwnersEntity, Long> {
}
