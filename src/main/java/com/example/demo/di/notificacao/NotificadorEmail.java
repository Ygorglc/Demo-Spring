package com.example.demo.di.notificacao;

import com.example.demo.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp){
        this.hostServidorSmtp = hostServidorSmtp;
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        if (this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificação %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta){
        this.caixaAlta = caixaAlta;
    }

}
