package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.model.Cliente;
import com.algaworks.algafoodapi.notificacao.NivelUrgencia;
import com.algaworks.algafoodapi.notificacao.Notificador;
import com.algaworks.algafoodapi.notificacao.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @TipoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificadores;

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificadores.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }

}