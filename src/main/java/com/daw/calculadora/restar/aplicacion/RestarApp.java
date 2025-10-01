package com.daw.calculadora.restar.aplicacion;

import com.daw.calculadora.shared.aplicacion.IOperation;
import com.daw.calculadora.shared.dominio.servicios.Matematico;
import org.springframework.stereotype.Service;

@Service
public class RestarApp implements IOperation {
    @Override
    public Integer operate(int op1, int op2) {
        return Matematico.restar(op1, op2);
    }
}
