package com.example.demo;

import com.example.demo.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.demoemail.com.br");
        notificador.setCaixaAlta(false);

        return notificador;
    }
}
