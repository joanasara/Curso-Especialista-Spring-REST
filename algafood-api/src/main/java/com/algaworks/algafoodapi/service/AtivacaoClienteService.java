package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {


    @Autowired
    private ApplicationEventPublisher eventPublisher;


    public void ativar(Cliente cliente) {
        cliente.ativar();
        eventPublisher.publishEvent( new ClienteAtivadoEvent(cliente));
    }

}