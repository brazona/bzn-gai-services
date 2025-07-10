package br.brazona.bzn_gai_services_identity.domain.dto;

import org.springframework.stereotype.Component;

import br.brazona.bzn_gai_services_identity.domain.models.CredentialModel;
import br.brazona.bzn_gai_services_identity.domain.models.TokenModel;
import br.brazona.bzn_gai_services_identity.infra.entities.CredentialsEntity;

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

	public CredentialsEntity toEntity(CredentialModel model) {
		return new CredentialsEntity(null, model.getUsername(), model.getPassword(), true, true, true, true, true);
	}
	public CredentialModel toModel(CredentialsEntity entity) {
		return new CredentialModel(entity.getUsername(), entity.getPassword());
	}
	public TokenModel toToken(String token) {
		return new TokenModel(token);
	}
}
