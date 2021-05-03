/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.fozna.calculadora.controller;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import es.fozna.calculadora.dto.DatosSimplesDto;
import es.fozna.calculadora.dto.ResultadoDto;
import es.fozna.calculadora.service.OperacionesBasicasService;
import es.fozna.calculadora.service.OperacionesEstadisticasService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author adolfo.urrutia
 */
@RestController
@RequestMapping("operacionesbasicas/")
public class OperacionesBasicasController {

    @Autowired
    OperacionesBasicasService operacionesService;
    
    @Autowired
    OperacionesEstadisticasService operacionesEstadisticasService;
    
    @PostMapping("sumar")
    public ResultadoDto postSumar(@RequestBody Map<String, String> datosConsulta) throws Exception {

        DatosSimplesDto datosSimples;
        ResultadoDto resultado;
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.USE_ANNOTATIONS, true);

        datosSimples = mapper.convertValue((Map<String, String>) datosConsulta, DatosSimplesDto.class);
        
        resultado = operacionesService.sumar(datosSimples);
        
        return resultado;
    }
    
    @PostMapping("restar")
    public ResultadoDto postRestar(@RequestBody Map<String, String> datosConsulta) throws Exception {

        DatosSimplesDto datosSimples;
        ResultadoDto resultado;
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.USE_ANNOTATIONS, true);

        datosSimples = mapper.convertValue((Map<String, String>) datosConsulta, DatosSimplesDto.class);
        
        resultado = operacionesService.restar(datosSimples);
        
        return resultado;
    }
    
    @PostMapping("multiplicar")
    public ResultadoDto postMultiplicar(@RequestBody Map<String, String> datosConsulta) throws Exception {

        DatosSimplesDto datosSimples;
        ResultadoDto resultado;
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.USE_ANNOTATIONS, true);

        datosSimples = mapper.convertValue((Map<String, String>) datosConsulta, DatosSimplesDto.class);
        
        resultado = operacionesService.multiplicar(datosSimples);
        
        return resultado;
    }
    
    @PostMapping("dividir")
    public ResultadoDto postDividir(@RequestBody Map<String, String> datosConsulta) throws Exception {

        DatosSimplesDto datosSimples;
        ResultadoDto resultado;
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.USE_ANNOTATIONS, true);

        datosSimples = mapper.convertValue((Map<String, String>) datosConsulta, DatosSimplesDto.class);
        
        resultado = operacionesService.dividir(datosSimples);
        
        return resultado;
    }
    
    @PostMapping("promedio")
    public ResultadoDto postPromedio(@RequestBody Map<String, String> datosConsulta) throws Exception {

        DatosSimplesDto datosSimples;
        ResultadoDto resultado;
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.USE_ANNOTATIONS, true);

        datosSimples = mapper.convertValue((Map<String, String>) datosConsulta, DatosSimplesDto.class);
        
        resultado = operacionesEstadisticasService.promedio(datosSimples);
        
        return resultado;
    }
}
