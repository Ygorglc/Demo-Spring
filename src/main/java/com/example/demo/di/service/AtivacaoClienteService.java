package com.example.demo.di.service;

import com.example.demo.di.modelo.Cliente;
import com.example.demo.di.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private NotificadorEmail notificador;

    public AtivacaoClienteService(NotificadorEmail notificador) {
        this.notificador = notificador;

        System.out.println("AtivacaoClienteService: "+ notificador);
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
