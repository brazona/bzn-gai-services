package br.brazona.bzn_gai_services_access.domain.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.brazona.bzn_gai_services_access.domain.dto.CredentialDTO;
import br.brazona.bzn_gai_services_access.domain.models.CredentialReqModel;
import br.brazona.bzn_gai_services_access.domain.models.CredentialRespModel;
import br.brazona.bzn_gai_services_access.domain.services.CredentialService;
import br.brazona.bzn_gai_services_access.infra.entities.CredentialsEntity;
import br.brazona.bzn_gai_services_access.infra.repositories.CredentialsRepository;

public class CredentialServiceImpl implements CredentialService{

	@Autowired
	private CredentialsRepository credentialsRepository;
	@Autowired
	private CredentialDTO credentialDTO;
	
	@Override
	public Void create(CredentialReqModel credentialRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CredentialRespModel readByUsername(String username) {
		// TODO Auto-generated method stub
		CredentialsEntity credentialRespModel = credentialsRepository.findByUsername(username);
		return credentialDTO.toModelResp("xxx");
	}

	@Override
	public Void update(CredentialReqModel credentialRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void delete(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CredentialRespModel> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
