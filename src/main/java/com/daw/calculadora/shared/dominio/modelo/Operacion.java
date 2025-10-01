package com.daw.calculadora.shared.dominio.modelo;

import lombok.Data;

@Data
public class Operacion {

    Integer operando1;
    Integer operando2;


    public int getOperando1() {
        return operando1;
    }

    public int getOperando2() {
        return operando2;
    }
}
