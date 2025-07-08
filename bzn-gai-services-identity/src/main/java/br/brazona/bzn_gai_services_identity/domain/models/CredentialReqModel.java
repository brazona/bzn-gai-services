package br.brazona.bzn_gai_services_identity.domain.models;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class CredentialReqModel {

	private String username;
	private String password;
}
