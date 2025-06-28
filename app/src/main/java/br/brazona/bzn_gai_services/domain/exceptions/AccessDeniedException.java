package br.brazona.bzn_gai_services.domain.exceptions;

import br.brazona.bzn_gai_services.domain.constants.ExceptionConst;

public class AccessDeniedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AccessDeniedException() {
        super(ExceptionConst.ACCESS_DENIED);
    }
}
