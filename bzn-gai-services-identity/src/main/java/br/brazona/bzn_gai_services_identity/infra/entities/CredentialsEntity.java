package br.brazona.bzn_gai_services_identity.infra.entities;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
* 
* Classe que representa a Entidade Credencial.
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/

@Entity
@Table(name = "credentials")
@Getter
@Setter
public class CredentialsEntity implements Serializable{

	@Serial
    private static final long serialVersionUID = 1L;
	
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private Boolean isAccountNonExpired;
    private Boolean isAccountNonLocked;
    private Boolean isCredentialsNonExpired;
    private Boolean isUpdatePassword;
    private Boolean isEnabled;
}
