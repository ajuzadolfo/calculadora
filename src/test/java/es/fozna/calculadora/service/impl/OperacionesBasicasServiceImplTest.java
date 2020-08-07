/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.fozna.calculadora.service.impl;

import es.fozna.calculadora.dto.DatosSimplesDto;
import es.fozna.calculadora.dto.ResultadoDto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adolfo.urrutia
 */
public class OperacionesBasicasServiceImplTest {
    
    public OperacionesBasicasServiceImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class OperacionesBasicasServiceImpl.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        DatosSimplesDto datosSimples = new DatosSimplesDto(5, 4);
        ResultadoDto expResult = new ResultadoDto(9);
        
        OperacionesBasicasServiceImpl instance = new OperacionesBasicasServiceImpl();
        
        ResultadoDto result = instance.sumar(datosSimples);
        assertEquals(expResult.getResultado(), result.getResultado());
    }

    /**
     * Test of restar method, of class OperacionesBasicasServiceImpl.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        DatosSimplesDto datosSimples = new DatosSimplesDto(11, 7);
        ResultadoDto expResult = new ResultadoDto(4);
        
        OperacionesBasicasServiceImpl instance = new OperacionesBasicasServiceImpl();
        
        ResultadoDto result = instance.restar(datosSimples);
        assertEquals(expResult.getResultado(), result.getResultado());
    }

    /**
     * Test of multiplicar method, of class OperacionesBasicasServiceImpl.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        DatosSimplesDto datosSimples = new DatosSimplesDto(7, 8);
        ResultadoDto expResult = new ResultadoDto(56);
        
        OperacionesBasicasServiceImpl instance = new OperacionesBasicasServiceImpl();
        
        ResultadoDto result = instance.multiplicar(datosSimples);
        assertEquals(expResult.getResultado(), result.getResultado());
    }

    /**
     * Test of dividir method, of class OperacionesBasicasServiceImpl.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
         DatosSimplesDto datosSimples = new DatosSimplesDto(15, 3);
        ResultadoDto expResult = new ResultadoDto(5);
        
        OperacionesBasicasServiceImpl instance = new OperacionesBasicasServiceImpl();
        
        ResultadoDto result = instance.dividir(datosSimples);
        assertEquals(expResult.getResultado(), result.getResultado());
    }
    
}
