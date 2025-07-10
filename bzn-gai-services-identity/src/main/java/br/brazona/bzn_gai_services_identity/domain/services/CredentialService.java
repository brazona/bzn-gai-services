package br.brazona.bzn_gai_services_identity.domain.services;

import java.util.List;

import br.brazona.bzn_gai_services_identity.domain.models.CredentialModel;
import br.brazona.bzn_gai_services_identity.domain.models.CredentialModel;

/**
* 
* Classe que representa o serviço que valida regras de negocio da funcionalidade credencial.
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/

public interface CredentialService {

	/**
    *
    * Método que cria uma credencial de acesso aos sistemas.
    *
    * @param credentialModel, objeto que representa uma credencial.
    *
    **/
	public void create(CredentialModel credentialModel);
	
	/**
    *
    * Método que consulta uma credencial de acesso aos sistemas pelo nome do usuário.
    *
    * @param username, valor que representa o valor do usuário.
    * @return CredentialModel, que representa as credenciais de um usuário.
    *
    **/
	public CredentialModel readByUsername(String username);
	
	/**
    *
    * Método que atualiza uma credencial de acesso aos sistemas.
    *
    * @param username, valor que representa o valor do usuário.
    *
    **/	
	public void update(CredentialModel credentialModel);
	
	/**
    *
    * Método que exclui (inativa) uma credencial de acesso aos sistemas.
    *
    * @param username, valor que representa o valor do usuário.
    *
    **/	
	public void delete(String username);

	/**
    *
    * Método que atualiza uma credencial de acesso aos sistemas.
    *
    * @return List<CredentialModel>, lista de credenciais de acesso.
    *
    **/	
	public List<CredentialModel>list();
}
