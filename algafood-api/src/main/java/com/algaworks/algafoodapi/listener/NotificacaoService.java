package com.algaworks.algafoodapi.listener;

import com.algaworks.algafoodapi.notificacao.NivelUrgencia;
import com.algaworks.algafoodapi.notificacao.Notificador;
import com.algaworks.algafoodapi.notificacao.TipoNotificador;
import com.algaworks.algafoodapi.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoEvent(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema esta ativo");
    }

}
