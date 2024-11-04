package com.algaworks.algafoodapi.injecaodepedencia.notificacao;

import com.algaworks.algafoodapi.injecaodepedencia.model.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorSms implements Notificador {


    public void NotificadorEmail() {
        System.out.println("NotificadorEmail REAL");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s atraves do SMS atraves do telefone %s: %s\n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
