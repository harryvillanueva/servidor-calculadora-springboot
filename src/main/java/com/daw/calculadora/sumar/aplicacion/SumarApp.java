package com.daw.calculadora.sumar.aplicacion;

import com.daw.calculadora.shared.aplicacion.IOperation;
import com.daw.calculadora.shared.dominio.servicios.Matematico;
import org.springframework.stereotype.Service;

@Service
public class SumarApp implements IOperation {
    @Override
    public Integer operate(int op1, int op2) {
        return Matematico.sumar(op1, op2);
    }
}
