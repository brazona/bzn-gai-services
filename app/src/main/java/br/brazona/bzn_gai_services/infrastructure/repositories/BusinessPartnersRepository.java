package br.brazona.bzn_gai_services.infrastructure.repositories;

import br.brazona.bzn_gai_services.infrastructure.entities.BusinessPartnersEntity;
import org.springframework.data.repository.CrudRepository;

public interface BusinessPartnersRepository extends CrudRepository<BusinessPartnersEntity, Long> {
}
