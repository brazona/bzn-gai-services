package br.brazona.bzn_gai_services_access.domain.models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


/**
* 
* Classe que representa o modelo de resposta dos dados de credenciais.
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/

@Component
@Getter
@AllArgsConstructor
public class CredentialRespModel {

	private String access_token;
}
