package br.brazona.bzn_gai_services.infrastructure.repositories;

import br.brazona.bzn_gai_services.infrastructure.entities.OwnersEntity;
import org.springframework.data.repository.CrudRepository;

public interface OwnersRepository extends CrudRepository<OwnersEntity, Long> {
}
