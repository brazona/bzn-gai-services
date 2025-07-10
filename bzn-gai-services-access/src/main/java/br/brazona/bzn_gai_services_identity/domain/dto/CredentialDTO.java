package br.brazona.bzn_gai_services_access.domain.dto;

import org.springframework.stereotype.Component;

import br.brazona.bzn_gai_services_access.domain.models.CredentialReqModel;
import br.brazona.bzn_gai_services_access.domain.models.CredentialRespModel;
import br.brazona.bzn_gai_services_access.infra.entities.CredentialsEntity;

/**
* 
* Classe que transforma dados de credenciais.
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/

@Component
public class CredentialDTO {

	public CredentialsEntity toEntity(CredentialReqModel model) {
		return new CredentialsEntity(null, model.getUsername(), model.getPassword(), true, true, true, true, true);
	}
	public CredentialRespModel toModelResp(String token) {
		return new CredentialRespModel(token);
	}
}
