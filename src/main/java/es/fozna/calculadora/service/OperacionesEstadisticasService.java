/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.fozna.calculadora.service;

import es.fozna.calculadora.dto.DatosSimplesDto;
import es.fozna.calculadora.dto.ResultadoDto;

/**
 *
 * @author adolfo.urrutia
 */
public interface OperacionesEstadisticasService {
     public ResultadoDto promedio(DatosSimplesDto datosSimples);
}
