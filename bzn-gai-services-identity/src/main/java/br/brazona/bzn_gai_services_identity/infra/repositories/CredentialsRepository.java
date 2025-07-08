package br.brazona.bzn_gai_services_identity.infra.repositories;

import org.springframework.data.repository.CrudRepository;
import br.brazona.bzn_gai_services_identity.infra.entities.CredentialsEntity;

/**
*
* Interface da classe que representa a conexão com a tabela Credencial
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/


public interface CredentialsRepository extends CrudRepository <CredentialsEntity, Long>{

}
