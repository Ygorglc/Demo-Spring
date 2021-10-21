package com.example.demo.di.service;

import java.util.List;
import com.example.demo.di.modelo.Cliente;
import com.example.demo.di.notificacao.NivelUrgencia;
import com.example.demo.di.notificacao.Notificador;
import com.example.demo.di.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AtivacaoClienteService {

   @Autowired
   private ApplicationEventPublisher eventPublisher;

   public void ativar(Cliente cliente){
       cliente.ativar();

       eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
   }
}
