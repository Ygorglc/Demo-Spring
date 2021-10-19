package com.example.demo.di.service;

import com.example.demo.di.modelo.Cliente;
import com.example.demo.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

    @Autowired
    public void setNotificador(Notificador notificador){
        this.notificador = notificador;
    }

}
