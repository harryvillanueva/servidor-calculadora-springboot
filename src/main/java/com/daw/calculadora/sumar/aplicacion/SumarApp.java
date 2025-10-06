package com.daw.calculadora.sumar.aplicacion;

import com.daw.calculadora.shared.aplicacion.IOperation;
import com.daw.calculadora.shared.dominio.entities.OperacionEntity;
import com.daw.calculadora.shared.dominio.enums.TipoOperacion;
import com.daw.calculadora.shared.dominio.repositorio.OperacionRepositorio;
import com.daw.calculadora.shared.dominio.servicios.Matematico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class SumarApp implements IOperation {
    @Autowired
    private OperacionRepositorio repo;
    @Override
    public Integer operate(int op1, int op2) {

        int res =Matematico.sumar(op1, op2);
        String tipoOperacion = TipoOperacion.SUMAR.toString();
        OperacionEntity operacionEntity =
        OperacionEntity.builder().operando1(op1).operando2(op2).tipoOperacion(tipoOperacion).resultado(res).build();
        repo.save(operacionEntity);
        return  res;
    }
}
