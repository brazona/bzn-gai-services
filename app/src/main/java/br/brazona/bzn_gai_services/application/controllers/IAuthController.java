package br.brazona.bzn_gai_services.application.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.brazona.bzn_gai_services.domain.views.business.AuthRequestBusinessVO;
import br.brazona.bzn_gai_services.domain.views.business.AuthResponseBusinessVO;
import br.brazona.bzn_gai_services.domain.views.business.AuthValidateCodeRequestBusinessVO;
import br.brazona.bzn_gai_services.domain.views.business.AuthorizationResponseVO;
import br.brazona.bzn_gai_services.domain.views.business.ForgotResponseVO;
import br.brazona.bzn_gai_services.domain.views.business.UpdatePassRequestBusinessVO;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * Classe para expor endpoint rest da funcionalidade Perfils..
 * 
 * @author Brazona Tech
 * @version 1.0.0
 * @since release 1.0.0
 */

@Tag(name = "gai", description = "Servidor que gerencia o acesso e identidade dos usuários dos sistemas", externalDocs = @ExternalDocumentation(description = "Documentação da Gestão de Acesso e Identidade (GAI)", url = "https://github.com/brazona/bzn-gai-services/tree/main/bzn-gai-services"))
public interface IAuthController {

	/**
	 * Método de autenticação do usuário, quando válido as informações fornecem um
	 * token de acesso.
	 * 
	 * @param auth - Objeto que contém as informações das credenciais para
	 *             autenticação, nome de usuário e senha para registro de acesso.
	 * @return ResponseEntity<AuthResponseBusinessVO> - Retorna o token de acesso.
	 * @throws Exception - Lança exceção caso ocorra erro ao autenticar.
	 * 
	 */

	@Operation(summary = "Autentica usuário", description = "Recurso que autentica o usuário e fornece um token de acesso.", operationId = "autenticaUsuario", tags = "gai", requestBody = @RequestBody(required = true, description = "Informações das credenciais do usuário", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AuthRequestBusinessVO.class))), method = "POST", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AuthResponseBusinessVO.class)), description = "Usuário autenticado com sucesso!"),
			@ApiResponse(responseCode = "400", description = "Formato inválido"),
			@ApiResponse(responseCode = "500", description = "Erro interno do sistema") })
	public ResponseEntity<AuthResponseBusinessVO> authentication(AuthRequestBusinessVO auth);

	/**
	 * Método que autoriza o usuário, quando válido as informações fornecem um token
	 * de acesso.
	 * 
	 * @param token - Token de acesso do usuário.
	 * @return ResponseEntity<AuthorizationResponseVO> - Retorna o token de acesso.
	 * @throws Exception - Lança exceção caso ocorra erro ao consultar o token.
	 */
	@Operation(summary = "Autoriza usuário", description = "Autoriza usuário através do token de acesso.", operationId = "autorizaUsuario", tags = "gai", method = "POST", parameters = @Parameter(name = "token", in = ParameterIn.HEADER, required = true, schema = @Schema(type = "string")), responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AuthResponseBusinessVO.class)), description = "Token autorizado com sucesso!"),
			@ApiResponse(responseCode = "400", description = "Formato inválido"),
			@ApiResponse(responseCode = "500", description = "Erro interno do sistema") })
	public ResponseEntity<AuthorizationResponseVO> authorization(String token);

	/**
	 * Método que recupera a senha do usuário.
	 * 
	 * @param auth - Objeto que contém as informações das credenciais para
	 *             autenticação, nome de usuário e senha para registro de acesso.
	 * @return ResponseEntity<ForgotResponseVO> - Retorna infomação do processo.
	 * @throws Exception - Lança exceção caso ocorra erro ao requisitar nova senha.
	 * 
	 */

        @Operation(summary = "Esqueci a senha", description = "Recurso que cria uma nova senha para o usuário.", operationId = "esqueciSenha", tags = "gai", requestBody = @RequestBody(required = true, description = "Informações do usuário", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AuthRequestBusinessVO.class))), method = "POST", responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ForgotResponseVO.class)), description = "Esqueci a senha executado com sucesso!"),
			@ApiResponse(responseCode = "400", description = "Formato inválido"),
			@ApiResponse(responseCode = "500", description = "Erro interno do sistema") })
        public ResponseEntity<ForgotResponseVO> forgotPassword(  AuthRequestBusinessVO auth);

        
	/**
	 * Método que atualiza a senha do usuário.
	 * 
	 * @param auth - Objeto que contém as informações das credenciais para
	 *             autenticação, nome de usuário e senha para registro de acesso.
	 * @param token - Token de acesso da aplicação.
	 * @return ResponseEntity<ForgotResponseVO> - Retorna infomação do processo.
	 * @throws Exception - Lança exceção caso ocorra erro ao alterar senha.
	 * 
	*/

        @Operation(summary = "Atualiza a senha", description = "Recurso que altera senha do usuário.", operationId = "alterarSenha", tags = "gai", requestBody = @RequestBody(required = true, description = "Informações do usuário", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UpdatePassRequestBusinessVO.class))), method = "POST", parameters = @Parameter(name = "token", in = ParameterIn.HEADER, required = true, schema = @Schema(type = "string")),responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ForgotResponseVO.class)), description = "Senha alterada com sucesso!"),
			@ApiResponse(responseCode = "400", description = "Formato inválido"),
			@ApiResponse(responseCode = "500", description = "Erro interno do sistema") })        
        public ResponseEntity<ForgotResponseVO> updatePassword(UpdatePassRequestBusinessVO auth, String token);
	
        /**
	 * Método que valida o código de acesso de recuperação de senha.
	 * 
	 * @param auth - Objeto que contém as informações o nome de usuário e o código.
	 * @return ResponseEntity<AuthResponseBusinessVO> - Retorna infomação do processo.
	 * @throws Exception - Lança exceção caso ocorra erro ao alterar senha.
	 * 
	*/

        @Operation(summary = "Valida codigo", description = "Recurso que valida o codigo de recuperação de senha.", operationId = "validaCodigo", tags = "gai", requestBody = @RequestBody(required = true, description = "Informações do código de validação", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AuthValidateCodeRequestBusinessVO.class))), method = "POST", parameters = @Parameter(name = "token", in = ParameterIn.HEADER, required = true, schema = @Schema(type = "string")),responses = {
			@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AuthResponseBusinessVO.class)), description = "Código validado com sucesso!"),
			@ApiResponse(responseCode = "400", description = "Formato inválido"),
			@ApiResponse(responseCode = "500", description = "Erro interno do sistema") })        
        
        public ResponseEntity<AuthResponseBusinessVO>  validateCode(AuthValidateCodeRequestBusinessVO auth);

}
