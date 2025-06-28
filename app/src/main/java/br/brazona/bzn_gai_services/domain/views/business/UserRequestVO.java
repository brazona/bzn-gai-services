package br.brazona.bzn_gai_services.domain.views.business;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class UserRequestVO {

    private Long id;
    private String username;
    private String password;
}
