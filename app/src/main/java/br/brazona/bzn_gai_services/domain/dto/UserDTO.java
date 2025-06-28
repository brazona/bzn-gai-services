package br.brazona.bzn_gai_services.domain.dto;

import br.brazona.bzn_gai_services.domain.views.business.UserRequestVO;
import br.brazona.bzn_gai_services.infrastructure.entities.UsersEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserDTO {

    public UsersEntity toEntity(UserRequestVO vo) {
        return new UsersEntity(

        );
    }

}
