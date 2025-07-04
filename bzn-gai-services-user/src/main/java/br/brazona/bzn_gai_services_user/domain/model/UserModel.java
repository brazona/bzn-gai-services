package br.brazona.bzn_gai_services_user.domain.model;


import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;

/**Classe modelo Usuário.
* @author Brazona Tech
* @version 1.0.0
* @since release 1.0.0
*/

@Component
@Schema(description = "Modelo objeto Usuário")
public class UserModel {

	@Schema( description = "Identificador do Usuário",
			  name = "id",
			  contentMediaType = "integer",
			  example = "23")
    private Long id;
	@Schema(
			  description = "Email do Usuário",
			  name = "email",
			  contentMediaType = "String",
			  example = "exemplo@exemplo.com.br")
    private String email;

    public UserModel() {
    }

    
    public UserModel(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
