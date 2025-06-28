package br.brazona.bzn_gai_services.infrastructure.repositories;

import br.brazona.bzn_gai_services.infrastructure.entities.OrganizationsEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationsRepository extends CrudRepository<OrganizationsEntity, Long> {
}
