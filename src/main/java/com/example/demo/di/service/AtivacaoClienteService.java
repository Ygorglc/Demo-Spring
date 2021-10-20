package com.example.demo.di.service;

import java.util.List;
import com.example.demo.di.modelo.Cliente;
import com.example.demo.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class AtivacaoClienteService {

    @Qualifier("semprioridade")
    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
