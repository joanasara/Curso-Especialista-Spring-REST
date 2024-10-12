package com.algaworks.algafoodapi.service;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    public AtivacaoClienteService ativacaoClienteService() {
        return  new AtivacaoClienteService();
    }
}
