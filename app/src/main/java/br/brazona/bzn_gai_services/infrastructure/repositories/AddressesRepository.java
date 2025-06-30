package br.brazona.bzn_gai_services.infrastructure.repositories;

import br.brazona.bzn_gai_services.infrastructure.entities.AddressesEntity;
import org.springframework.data.repository.CrudRepository;

/**
*
 * Interface class for connecting to table database [ AddressesRepository ]
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/
public interface AddressesRepository extends CrudRepository<AddressesEntity, Long> {
}
