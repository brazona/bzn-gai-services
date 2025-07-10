package br.brazona.bzn_gai_services_identity.domain.models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
* 
* Classe que representa o modelo de requisicao dos dados de credenciais.
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CredentialModel {

	private String username;
	private String password;
}
