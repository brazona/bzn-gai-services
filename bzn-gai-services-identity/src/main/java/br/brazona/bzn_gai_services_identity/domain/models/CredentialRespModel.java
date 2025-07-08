package br.brazona.bzn_gai_services_identity.domain.models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@AllArgsConstructor
public class CredentialRespModel {

	private String access_token;
}
