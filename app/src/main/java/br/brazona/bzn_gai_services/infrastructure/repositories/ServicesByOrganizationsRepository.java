package br.brazona.bzn_gai_services.infrastructure.repositories;

import br.brazona.bzn_gai_services.infrastructure.entities.ServicesByOrganizationsEntity;
import org.springframework.data.repository.CrudRepository;

public interface ServicesByOrganizationsRepository extends CrudRepository<ServicesByOrganizationsEntity, Long> {
}
