package com.bosonit.BS3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TerceraClase implements CommandLineRunner {

    Usuario usuario = new Usuario(1,"Manolo");

    @Override
    public void run(String... args) throws Exception {
        System.out.println("HOLA DESDE CLASE TERCIARIA");
        System.out.println("LOS PARAMETROS QUE GENERO DE UN USUARIO SON: " + usuario.toString());
    }
}
