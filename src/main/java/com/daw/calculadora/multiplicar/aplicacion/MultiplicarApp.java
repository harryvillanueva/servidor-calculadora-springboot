package com.daw.calculadora.multiplicar.aplicacion;

import com.daw.calculadora.shared.aplicacion.IOperation;
import com.daw.calculadora.shared.dominio.servicios.Matematico;
import org.springframework.stereotype.Service;

@Service
public class MultiplicarApp implements IOperation {
    @Override
    public Integer operate(int op1, int op2) {
        return Matematico.multiplicar(op1, op2);
    }
}
