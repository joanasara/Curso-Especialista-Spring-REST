package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.model.Cliente;
import com.algaworks.algafoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AtivacaoClienteService {

    @Autowired
    @Qualifier("notificadorEmail")
    private  Notificador notificadores;

    @PostConstruct
    public void init() {
        System.out.println("INIT");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificadores.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }

}