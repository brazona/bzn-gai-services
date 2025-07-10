package br.brazona.bzn_gai_services_access.domain.services;

import java.util.List;

import br.brazona.bzn_gai_services_access.domain.models.CredentialReqModel;
import br.brazona.bzn_gai_services_access.domain.models.CredentialRespModel;

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

	Void create(CredentialReqModel credentialRequest);
	CredentialRespModel readByUsername(String username);
	Void update(CredentialReqModel credentialRequest);
	Void delete(String username);
	List<CredentialRespModel>list();
}
