package com.example.di.service;

import com.example.di.modelo.Cliente;
import com.example.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {

    private NotificadorEmail notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
