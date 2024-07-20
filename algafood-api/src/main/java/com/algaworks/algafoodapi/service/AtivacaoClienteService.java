package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.model.Cliente;
import com.algaworks.algafoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Qualifier("email")
    @Autowired
    private Notificador notificadores;

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificadores.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }

}