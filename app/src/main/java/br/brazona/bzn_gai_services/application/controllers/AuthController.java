package br.brazona.bzn_gai_services.application.controllers;

import br.brazona.bzn_gai_services.application.interfaces.IAuthController;
import br.brazona.bzn_gai_services.domain.services.business.AuthService;
import br.brazona.bzn_gai_services.domain.views.business.AuthRequestBusinessVO;
import br.brazona.bzn_gai_services.domain.views.business.AuthResponseBusinessVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController implements IAuthController {
    @Autowired
    private AuthService service;

    @Override
    public ResponseEntity<AuthResponseBusinessVO> authentication(AuthRequestBusinessVO auth) {
        AuthResponseBusinessVO tokenDTO = service.authentication(auth);
        return ResponseEntity.ok()
                .header("Authorization", tokenDTO.getToken())
                .body(tokenDTO);
    }
}
