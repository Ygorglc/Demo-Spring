package com.example.di.notificacao;

import com.example.di.modelo.Cliente;

public class NotificadorEmail {

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificação %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
    
}
