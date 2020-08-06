/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.fozna.calculadora.service.impl;

import es.fozna.calculadora.dto.DatosSimplesDto;
import es.fozna.calculadora.dto.ResultadoDto;
import es.fozna.calculadora.service.OperacionesBasicasService;
import org.springframework.stereotype.Service;

/**
 *
 * @author adolfo.urrutia
 */
@Service
public class OperacionesBasicasServiceImpl implements OperacionesBasicasService {

    @Override
    public ResultadoDto sumar(DatosSimplesDto datosSimples) {
        ResultadoDto resultado;

        resultado = new ResultadoDto(datosSimples.getOperando1() + datosSimples.getOperando2());

        return resultado;
    }

    @Override
    public ResultadoDto restar(DatosSimplesDto datosSimples) {
        ResultadoDto resultado;

        resultado = new ResultadoDto(datosSimples.getOperando1() - datosSimples.getOperando2());

        return resultado;
    }

    @Override
    public ResultadoDto multiplicar(DatosSimplesDto datosSimples) {
        ResultadoDto resultado;

        resultado = new ResultadoDto(datosSimples.getOperando1() * datosSimples.getOperando2());

        return resultado;
    }

    @Override
    public ResultadoDto dividir(DatosSimplesDto datosSimples) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
