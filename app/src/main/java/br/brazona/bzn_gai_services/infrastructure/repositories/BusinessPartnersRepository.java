package br.brazona.bzn_gai_services.infrastructure.repositories;

import br.brazona.bzn_gai_services.infrastructure.entities.BusinessPartnersEntity;
import org.springframework.data.repository.CrudRepository;

/**
*
* Interface class for connecting to table database [ BusinessPartnersRepository ]
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/
public interface BusinessPartnersRepository extends CrudRepository<BusinessPartnersEntity, Long> {
}
