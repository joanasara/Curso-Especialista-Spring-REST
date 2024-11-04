package com.algaworks.algafoodapi.injecaodepedencia.service;

import com.algaworks.algafoodapi.injecaodepedencia.model.Cliente;
import lombok.Getter;

@Getter
public class ClienteAtivadoEvent {

    private final Cliente cliente;

    public ClienteAtivadoEvent(Cliente cliente) {
        super();
        this.cliente = cliente;
    }

}
