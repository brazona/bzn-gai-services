package br.brazona.bzn_gai_services.application.controllers.impl;

import br.brazona.bzn_gai_services.application.controllers.IAuthController;
import br.brazona.bzn_gai_services.domain.constants.EndpointsConst;
import br.brazona.bzn_gai_services.domain.constants.ExceptionConst;
import br.brazona.bzn_gai_services.domain.constants.LogsConst;
import br.brazona.bzn_gai_services.domain.services.business.AuthService;
import br.brazona.bzn_gai_services.domain.services.business.SessionService;
import br.brazona.bzn_gai_services.domain.views.business.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* 
* Class that provides endpoint for user authentication and authorization.
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/

@Slf4j
@RestController
@RequestMapping(value = "/auth/v1")
public class AuthControllerImpl implements IAuthController {
	
    @Autowired
    private AuthService service;
    @Autowired
    private SessionService sessionService;
    
    /**
    *
    * Class constructor.
    *
    **/
    public AuthControllerImpl() {
   }

   public AuthControllerImpl(AuthService service, SessionService sessionService) {
       this.service = service;
       this.sessionService = sessionService;
   }
	
	/**
	 * 
	 * {@inheritDoc}
	 * 
	 */
   
	@Override
	@PostMapping(value = "/authentication", produces = MediaType.APPLICATION_JSON_VALUE
    , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AuthResponseBusinessVO> authentication(@RequestBody AuthRequestBusinessVO auth) {
		
        log.info(LogsConst.ENDPOINT_INFO, EndpointsConst.AUTH_AUTHENTICATION);
        log.debug(LogsConst.ENDPOINT_DEBUG, auth);
        AuthResponseBusinessVO tokenDTO = service.authentication(auth);
        sessionService.createUpdate(new SessionVO(auth.getUsername(), tokenDTO.getToken()));
        return ResponseEntity.ok()
                .header("Authorization", "Bearer "+tokenDTO.getToken())
                .body(tokenDTO);
	}
	
	/**
	 * 
	 * {@inheritDoc}
	 * 
	 */
	
	@Override
	@PostMapping(value = "/authorization", produces = MediaType.APPLICATION_JSON_VALUE
		    , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AuthorizationResponseVO> authorization(@RequestHeader(required = true, value = "Authorization") String token) {
		
        log.info(LogsConst.ENDPOINT_INFO, EndpointsConst.AUTH_AUTHORIZATION);
        log.debug(LogsConst.ENDPOINT_DEBUG, "null", token);
        return ResponseEntity.ok().body(
                new AuthorizationResponseVO(true, ExceptionConst.AUTHORIZED));
	}

	/**
	 * 
	 * {@inheritDoc}
	 * 
	 */
	@Override
	@PostMapping(value = "/forgot", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ForgotResponseVO> forgotPassword(@RequestBody AuthRequestBusinessVO auth) {

        log.info(LogsConst.ENDPOINT_INFO, EndpointsConst.AUTH_FORGOT);
        log.debug(LogsConst.ENDPOINT_DEBUG, auth);
        return ResponseEntity.ok()
                .body(service.forgotPassword(auth));
	}

	/**
	 * 
	 * {@inheritDoc}
	 * 
	 */
	
	
	@Override
	@PostMapping(value = "/update/password", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ForgotResponseVO> updatePassword(@RequestBody UpdatePassRequestBusinessVO auth, @RequestHeader(required = true, value = "Authorization") String token) {
		
        log.info(LogsConst.ENDPOINT_INFO, EndpointsConst.AUTH_UPDATE_PASSWORD);
        log.debug(LogsConst.ENDPOINT_DEBUG, auth, "null");
        log.debug(LogsConst.ENDPOINT_DEBUG, auth, token);
        return ResponseEntity.ok()
                .body(service.updatePassword(auth));
	}
	/**
	 * 
	 * {@inheritDoc}
	 * 
	 */
	@Override
	@PostMapping(value = "/validate/code", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AuthResponseBusinessVO> validateCode(
            @RequestBody AuthValidateCodeRequestBusinessVO auth) {

        log.info(LogsConst.ENDPOINT_INFO, EndpointsConst.AUTH_VALIDATE_CODE);
        log.debug(LogsConst.ENDPOINT_DEBUG, auth, "null");
        
        AuthResponseBusinessVO tokenDTO = service.validateCode(auth);
        sessionService.createUpdate(new SessionVO(auth.getUsername(), tokenDTO.getToken()));
        return ResponseEntity.ok()
                .header("Authorization", "Bearer "+tokenDTO.getToken())
                .body(tokenDTO);
	}
    
}
