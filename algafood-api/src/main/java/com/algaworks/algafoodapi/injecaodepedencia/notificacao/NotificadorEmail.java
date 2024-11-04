package com.algaworks.algafoodapi.injecaodepedencia.notificacao;

import com.algaworks.algafoodapi.injecaodepedencia.model.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("notificadorEmail")
public class NotificadorEmail implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Notificando " + cliente.getNome() + " via e-mail: " + mensagem);
    }
}
