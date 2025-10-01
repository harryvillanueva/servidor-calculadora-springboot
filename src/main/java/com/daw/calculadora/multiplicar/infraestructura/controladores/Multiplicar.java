package com.daw.calculadora.multiplicar.infraestructura.controladores;

import com.daw.calculadora.multiplicar.aplicacion.MultiplicarApp;
import com.daw.calculadora.shared.dominio.modelo.Operacion;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Multiplicar {

    MultiplicarApp multiplicar;
    @PostMapping("/multiplicar")
    Integer multiplica (@RequestBody Operacion multiplica) {
        return multiplicar.operate(
                multiplica.getOperando1(),
                multiplica.getOperando2()
        );
    }
}
