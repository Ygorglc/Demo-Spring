package com.example.demo;

import com.example.demo.di.notificacao.Notificador;
import com.example.demo.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
        return new AtivacaoClienteService(notificador);
    }

}
