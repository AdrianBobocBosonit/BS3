package com.bosonit.BS3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MiComponente implements CommandLineRunner {

    @PostConstruct
    public void ejecutate() {
        System.out.println("Linea a ejecutar cuando se haya instanciado esta clase");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("HOLA DESDE CLASE SECUNDARIA");
    }
}
