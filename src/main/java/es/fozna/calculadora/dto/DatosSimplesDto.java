/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.fozna.calculadora.dto;

/**
 *
 * @author adolfo.urrutia
 */
public class DatosSimplesDto {
    double operando1,operando2;

    public DatosSimplesDto() {}

    public DatosSimplesDto(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }
}
