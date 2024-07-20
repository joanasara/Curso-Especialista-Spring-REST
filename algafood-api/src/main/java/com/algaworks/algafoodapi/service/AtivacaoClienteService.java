package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.model.Cliente;
import com.algaworks.algafoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Autowired
    private Notificador notificadores;

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificadores.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }

}