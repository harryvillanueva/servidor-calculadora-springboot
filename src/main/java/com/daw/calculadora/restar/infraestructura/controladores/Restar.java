package com.daw.calculadora.restar.infraestructura.controladores;

import com.daw.calculadora.restar.aplicacion.RestarApp;
import com.daw.calculadora.shared.dominio.modelo.Operacion;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Restar {

    RestarApp restar;
    @PostMapping("/restar")
    Integer resta (@RequestBody Operacion resta) {
        return restar.operate(
                resta.getOperando1()
                , resta.getOperando2()
        );
    }
}
