package com.algaworks.algafoodapi.injecaodepedencia.listener;

import com.algaworks.algafoodapi.injecaodepedencia.notificacao.NivelUrgencia;
import com.algaworks.algafoodapi.injecaodepedencia.notificacao.Notificador;
import com.algaworks.algafoodapi.injecaodepedencia.notificacao.TipoNotificador;
import com.algaworks.algafoodapi.injecaodepedencia.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoNotificador(NivelUrgencia.SEM_URGENCIA)
    //@Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoEvent(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema esta ativo");
    }

}
