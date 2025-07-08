package br.brazona.bzn_gai_services_identity.domain.dto;

import org.springframework.stereotype.Component;

import br.brazona.bzn_gai_services_identity.domain.models.CredentialReqModel;
import br.brazona.bzn_gai_services_identity.domain.models.CredentialRespModel;
import br.brazona.bzn_gai_services_identity.infra.entities.CredentialsEntity;

@Component
public class CredentialDTO {

	public CredentialsEntity toEntity(CredentialReqModel model) {
		return new CredentialsEntity(null, model.getUsername(), model.getPassword(), true, true, true, true, true);
	}
	public CredentialRespModel toModelResp(String token) {
		return new CredentialRespModel(token);
	}
}
