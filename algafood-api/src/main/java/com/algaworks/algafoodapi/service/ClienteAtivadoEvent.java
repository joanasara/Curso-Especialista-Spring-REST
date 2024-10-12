package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.model.Cliente;
import lombok.Getter;

@Getter
public class ClienteAtivadoEvent {

    private final Cliente cliente;

    public ClienteAtivadoEvent(Cliente cliente) {
        super();
        this.cliente = cliente;
    }

}
