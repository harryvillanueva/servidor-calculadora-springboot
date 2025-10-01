package com.daw.calculadora.shared.dominio.servicios;

import org.springframework.stereotype.Service;

@Service
public class Matematico {

    private Matematico() {}

    public static int sumar(int op1, int op2) {
        return op1 + op2;
    }

    public static int restar(int op1, int op2) {
        return op1 - op2;
    }

    public static int multiplicar(int op1, int op2) {
        return op1 * op2;
    }

    public static int dividir(int op1, int op2) {
        return op1 / op2;
    }

    public static double potenciar(int op1,int op2){

        return Math.pow(op1,op2);
    }
}
