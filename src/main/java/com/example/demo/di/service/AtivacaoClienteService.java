package com.example.demo.di.service;

import java.util.List;
import com.example.demo.di.modelo.Cliente;
import com.example.demo.di.notificacao.NivelUrgencia;
import com.example.demo.di.notificacao.Notificador;
import com.example.demo.di.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class AtivacaoClienteService {

    @TipoDoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

 //   @PostConstruct
    public void init(){
        System.out.println("Iniciado");
    }

 //   @PreDestroy
    public void destroy(){
        System.out.println("Destruido");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
