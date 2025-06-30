package br.brazona.bzn_gai_services.domain.dto;

import br.brazona.bzn_gai_services.domain.constants.MailConst;
import br.brazona.bzn_gai_services.domain.utils.EnvUtil;
import br.brazona.bzn_gai_services.domain.views.MailSSlVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MailDTO {
    private static final String MAIL_HOST = "";
    @Autowired
    private EnvUtil envUtil;
    public MailSSlVO propertiesTotTlsVo(){
        return new MailSSlVO(
                envUtil.getEnvValue(MailConst.MAIL_HOST),
                envUtil.getEnvValue(MailConst.MAIL_PORT),
                envUtil.getEnvValue(MailConst.MAIL_SSL_CLASS),
                envUtil.getEnvValue(MailConst.MAIL_AUTH),
                envUtil.getEnvValue(MailConst.MAIL_USERNAME),
                envUtil.getEnvValue(MailConst.MAIL_PASSWORD),
                envUtil.getEnvValue(MailConst.MAIL_FROM)
        );
    }
}
