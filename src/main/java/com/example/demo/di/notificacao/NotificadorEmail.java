package com.example.demo.di.notificacao;

import com.example.demo.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("semprioridade")
@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("Notificação %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
