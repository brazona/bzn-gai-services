package br.brazona.bzn_gai_services_identity.infra.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * Classe que representa a entidade Usuário.
 * @author Brazona Tech
 * @version 1.0.0
 * @since release 1.0.0
 */

@Entity
@Table(name = "user")
@Getter
@Component
@Setter
public class UserEntity implements Serializable {
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
    private Boolean isEnabled;
    @Column(columnDefinition = "boolean default false")
    private Boolean isUpdatePassword;

    /**
     *
     * method constructor.
     *
     **/
    public UserEntity() {
    }
    /**
     * 
     * Method that provides the object with authentication data.
     * 
     * @param name Object of the User class, with the application's authentication values.
     * @param email Object of the User class, with the application's authentication values.
     * @param password Object of the User class, with the application's authentication values.
     * @param isAccountNonExpired Object of the User class, with the application's authentication values.
     * @param isAccountNonLocked Object of the User class, with the application's authentication values.
     * @param isCredentialsNonExpired Object of the User class, with the application's authentication values.
     * @param isEnabled Object of the User class, with the application's authentication values.
     *
     **/
    public UserEntity(String name, String email, String password, Boolean isAccountNonExpired, Boolean isAccountNonLocked,
                       Boolean isCredentialsNonExpired, Boolean isEnabled ) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
        this.isEnabled = isEnabled;
    }
    /**
     *
     * Method that provides the object with authentication data.
     *
     * @param id Object of the User class, with the application's authentication values.
     * @param email Object of the User class, with the application's authentication values.
     * @param password Object of the User class, with the application's authentication values.
     *
     **/
    public UserEntity(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    /**
     * 
     * Method that provides the object with authentication data.
     * @return String, name that user.
     * 
     **/
    public String getUsername() {
        return this.email;
    }
    /**
     *
     * Method that provides the object with authentication data.
     *
     * @param name Object of the User class, with the application's authentication values.
     * @param email Object of the User class, with the application's authentication values.
     * @param password Object of the User class, with the application's authentication values.
     * @param isAccountNonExpired Object of the User class, with the application's authentication values.
     * @param isAccountNonLocked Object of the User class, with the application's authentication values.
     * @param isCredentialsNonExpired Object of the User class, with the application's authentication values.
     * @param isEnabled Object of the User class, with the application's authentication values.
     *
     **/
    public UserEntity(Long id, String name, String email, String password, Boolean isAccountNonExpired, Boolean isAccountNonLocked,
                       Boolean isCredentialsNonExpired, Boolean isEnabled, Boolean isUpdatePassword ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
        this.isEnabled = isEnabled;
        this.isUpdatePassword = isUpdatePassword;
    }
}