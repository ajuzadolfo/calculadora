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
public class ResultadoDto {
    private double resultado;

    public ResultadoDto(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
}
