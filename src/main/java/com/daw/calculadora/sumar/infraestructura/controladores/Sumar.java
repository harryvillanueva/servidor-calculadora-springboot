package com.daw.calculadora.sumar.infraestructura.controladores;

import com.daw.calculadora.shared.dominio.modelo.Operacion;
import com.daw.calculadora.sumar.aplicacion.SumarApp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Sumar {

    SumarApp sumar;
    @PostMapping("/sumar")
    Integer suma (@RequestBody Operacion suma) {
        return sumar.operate(
                suma.getOperando1(),
                suma.getOperando2()
        );
    }
}
