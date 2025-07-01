package br.brazona.bzn_gai_services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

/**
* 
* Class that transforms authentication data.
* 
* @author Brazona Tech
* @version 1.0
* @since 1.0
*
**/

@Slf4j
@EnableAutoConfiguration
@EntityScan(basePackages = { "br.brazona.bzn_gai_services.infra.entities" })
@ComponentScan( basePackages = {"br.brazona.bzn_gai_services.*"})
@EnableJpaRepositories(basePackages = {"br.brazona.bzn_gai_services.infra.repositories"})
@EnableTransactionManagement
@RestController
@EnableCaching
@SpringBootApplication
public class BznGaiServicesApplication {
    /**
     *
     * Class constructor.
     *
     **/
    public BznGaiServicesApplication() {
    }

    /**
     *
     * Class Main.
     *
     **/
    public static void main(String[] args) {
        SpringApplication.run(BznGaiServicesApplication.class, args);
    }
}
