package br.brazona.bzn_gai_services_access.infra.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import br.brazona.bzn_gai_services_access.infra.entities.CredentialsEntity;

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

    /**
    *
    * Method that queries the user record by name.
    *
    * @param username, name that user.
    * @return UsersEntity, Class Entity Users.
    *
    **/
   @Query("SELECT u FROM CredentialsEntity u WHERE u.username =?1")
   CredentialsEntity findByUsername(String username);
}
