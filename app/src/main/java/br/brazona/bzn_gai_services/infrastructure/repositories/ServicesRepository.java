package br.brazona.bzn_gai_services.infrastructure.repositories;

import br.brazona.bzn_gai_services.infrastructure.entities.ServicesEntity;
import org.springframework.data.repository.CrudRepository;

public interface ServicesRepository extends CrudRepository<ServicesEntity, Long> {
}
