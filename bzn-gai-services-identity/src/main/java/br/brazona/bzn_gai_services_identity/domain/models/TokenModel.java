package br.brazona.bzn_gai_services_identity.domain.models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


/**
* 
* Classe que representa o token de acesso de uma credencial.
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/

@Component
@Getter
@AllArgsConstructor
public class TokenModel {

	private String access_token;
}
