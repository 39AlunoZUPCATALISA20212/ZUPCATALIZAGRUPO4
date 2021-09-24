package br.com.zup.Projeto.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConfigApp {
    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }
}
