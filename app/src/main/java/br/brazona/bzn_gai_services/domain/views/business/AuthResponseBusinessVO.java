package br.brazona.bzn_gai_services.domain.views.business;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class AuthResponseBusinessVO {

    private String token;

    public AuthResponseBusinessVO() {
    }

    public AuthResponseBusinessVO(String token) {
        this.token = token;
    }
}
