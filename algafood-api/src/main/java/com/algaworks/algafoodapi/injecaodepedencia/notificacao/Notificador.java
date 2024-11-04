package com.algaworks.algafoodapi.injecaodepedencia.notificacao;

import com.algaworks.algafoodapi.injecaodepedencia.model.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
