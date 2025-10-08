package com.daw.calculadora.dividir.infraestructura;

import com.daw.calculadora.dividir.aplicacion.DividirApp;
import lombok.AllArgsConstructor;
import com.daw.calculadora.shared.dominio.modelo.Operacion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Dividir {

    DividirApp dividir;
    @PostMapping ("/dividir")
    Integer divide (@RequestBody Operacion divide){

        return dividir.operate(
                divide.getOperando1(),divide.getOperando2()
        );
    }

}
