package br.brazona.bzn_gai_services.application.interfaces;

import br.brazona.bzn_gai_services.domain.views.business.AuthRequestBusinessVO;
import br.brazona.bzn_gai_services.domain.views.business.AuthResponseBusinessVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/v1/auth")
public interface IAuthController {

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping(value = "/authentication", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AuthResponseBusinessVO> authentication(
            @RequestBody AuthRequestBusinessVO auth);
}
