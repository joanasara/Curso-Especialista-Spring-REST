package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.model.Cliente;
import com.algaworks.algafoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false) //Essa implementacao e uma boa sugestao quando temos mais de dois Beans para ser injetado
    private List<Notificador> notificadores;

    public void ativar(Cliente cliente) {
        cliente.ativar();
        for (Notificador notificador : notificadores) {
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        }
    }

}