package br.brazona.bzn_gai_services_identity.domain.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.brazona.bzn_gai_services_identity.domain.dto.CredentialDTO;
import br.brazona.bzn_gai_services_identity.domain.models.CredentialModel;
import br.brazona.bzn_gai_services_identity.domain.services.CredentialService;
import br.brazona.bzn_gai_services_identity.infra.repositories.CredentialsRepository;


/**
* 
* Classe que representa a implementação do serviço da funcionalidade Credenciais.
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/

@Service
public class CredentialServiceImpl implements CredentialService{

	@Autowired
	private CredentialsRepository credentialsRepository;
	@Autowired
	private CredentialDTO credentialDTO;
	
	/** { @inheritDoc } */
	@Override
	public void create(CredentialModel credentialModel) {
		// TODO Auto-generated method stub

	}

	/** { @inheritDoc } */
	@Override
	public CredentialModel readByUsername(String username) {
		// TODO Auto-generated method stub
		return credentialDTO.toModel(credentialsRepository.findByUsername(username));
	}

	/** { @inheritDoc } */
	@Override
	public void update(CredentialModel credentialModel) {
		// TODO Auto-generated method stub
	}

	/** { @inheritDoc } */
	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
	}

	/** { @inheritDoc } */
	@Override
	public List<CredentialModel> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
