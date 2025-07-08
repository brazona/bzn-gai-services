package br.brazona.bzn_gai_services_identity.infra.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * Classe que representa a entidade Regras.
 * @author Brazona Tech
 * @version 1.0.0
 * @since release 1.0.0
 */

@Entity
@Table(name="role")
@Getter
public class RoleEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    private RolesEnum name;
    /**
     *
     * Class constructor.
     *
     **/
    public RoleEntity() {
    }
    /**
     * 
     * Method that provides the object with authentication data.
     * 
     * @param id Object of the User class, with the application's authentication values.
     * @param name Object of the User class, with the application's authentication values.
     * 
     **/
    public RoleEntity(Long id, RolesEnum name) {
        this.id = id;
        this.name = name;
    }

}