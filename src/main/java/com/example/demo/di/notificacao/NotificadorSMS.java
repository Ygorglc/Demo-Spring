package com.example.demo.di.notificacao;

import com.example.demo.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("prioridade")
@Component
public class NotificadorSMS implements Notificador {

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificação %s por SMS através do telefone %s: %s\n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
