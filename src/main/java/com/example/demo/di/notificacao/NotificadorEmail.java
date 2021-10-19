package com.example.demo.di.notificacao;

import com.example.demo.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail {

    public NotificadorEmail(){
        System.out.println("NotificadorEmail");
    }

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificação %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}