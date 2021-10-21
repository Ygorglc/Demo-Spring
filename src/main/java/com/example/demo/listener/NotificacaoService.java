package com.example.demo.listener;

import com.example.demo.di.notificacao.NivelUrgencia;
import com.example.demo.di.notificacao.Notificador;
import com.example.demo.di.notificacao.TipoDoNotificador;
import com.example.demo.di.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event){
        System.out.println("Cliente " + event);
        notificador.notificar(event.getCliente(),"Seu cadastro no sistema está ativo!");
    }
}
