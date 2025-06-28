package br.brazona.bzn_gai_services.infrastructure.entities;

import br.brazona.bzn_gai_services.domain.enuns.RolesEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="roles")
@Getter
public class RolesEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    private RolesEnum name;

    public RolesEntity() {
    }

    public RolesEntity(Long id, RolesEnum name) {
        this.id = id;
        this.name = name;
    }

}
