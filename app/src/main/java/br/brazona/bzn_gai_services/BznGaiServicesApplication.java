package br.brazona.bzn_gai_services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Slf4j
@EnableAutoConfiguration
@EntityScan(basePackages = { "br.brazona.bzn_gai_services.infrastructure.entities" })
@ComponentScan( basePackages = {"br.brazona.bzn_gai_services.*"})
@EnableJpaRepositories(basePackages = {"br.brazona.bzn_gai_services.infrastructure.repositories"})
@EnableTransactionManagement
@EnableWebMvc
@RestController
@EnableCaching
@SpringBootApplication
@EnableFeignClients
public class BznGaiServicesApplication {


    public static void main(String[] args) {
        SpringApplication.run(BznGaiServicesApplication.class, args);
        log.error("br.brazona.bzn_gai_services: LOG ERROR");
        log.warn("br.brazona.bzn_gai_services: LOG WARN");
        log.info("br.brazona.bzn_gai_services: LOG INFO");
        log.debug("br.brazona.bzn_gai_services: LOG DEBUG");
        log.trace("br.brazona.bzn_gai_services: LOG TRACE");

    }
}
