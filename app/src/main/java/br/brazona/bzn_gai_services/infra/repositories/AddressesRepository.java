package br.brazona.bzn_gai_services.infra.repositories;

import br.brazona.bzn_gai_services.infra.entities.AddressesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
*
 * Interface class for connecting to table database [ AddressesRepository ]
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/
@Repository
public interface AddressesRepository extends CrudRepository<AddressesEntity, Long> {
}
