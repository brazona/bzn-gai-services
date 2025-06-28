package br.brazona.bzn_gai_services.infrastructure.repositories;

import br.brazona.bzn_gai_services.infrastructure.entities.AddressesEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressesRepository extends CrudRepository<AddressesEntity, Long> {
}
