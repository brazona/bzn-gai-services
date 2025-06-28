package br.brazona.bzn_gai_services.domain.exceptions;

import br.brazona.bzn_gai_services.domain.constants.ExceptionConst;

public class UserNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UserNotFoundException() {
        super("User "+ExceptionConst.NOT_FOUND);
    }
}
