package com.daw.calculadora.potenciar.infraestructura;
import com.daw.calculadora.multiplicar.aplicacion.MultiplicarApp;
import com.daw.calculadora.potenciar.aplicacion.PotenciarApp;
import com.daw.calculadora.shared.dominio.modelo.Operacion;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Potenciar {

    PotenciarApp potenciar;
    @PostMapping("/potenciar")
    Integer potencia (@RequestBody Operacion potencia) {
        return potenciar.operate(
                potencia.getOperando1(),
                potencia.getOperando2()
        );
    }
}
