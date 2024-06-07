/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cajero;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Daniel
 */
public class GestorCuentaTest {
    private GestorCuenta gestorCuenta;
    
    public GestorCuentaTest() {
         gestorCuenta = new GestorCuenta();
         gestorCuenta.extraerCuentaUsuario("eli15");
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
     * Test of crearEvento method, of class GestorCuenta.
     */
    @Test
    public void testCrearEvento() {
        System.out.println("crearEvento");
        Evento evento = null;
        GestorCuenta instance = new GestorCuenta();
        instance.crearEvento(evento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anadirCuenta method, of class GestorCuenta.
     */
    @Test
    public void testAnadirCuenta() {
        System.out.println("anadirCuenta");
        String divisa = "";
        String nroCuenta = "";
        String montoInicial = "";
        GestorCuenta instance = new GestorCuenta();
        instance.anadirCuenta(divisa, nroCuenta, montoInicial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEventos method, of class GestorCuenta.
     */
    @Test
    public void testGetEventos() {
        System.out.println("getEventos");
        GestorCuenta instance = new GestorCuenta();
        List<Evento> expResult = null;
        List<Evento> result = instance.getEventos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearCuenta method, of class GestorCuenta.
     */
    @Test
    public void testCrearCuenta() {
        System.out.println("crearCuenta");
        Usuario usuario = null;
        GestorCuenta instance = new GestorCuenta();
        instance.crearCuenta(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarNumeroDeCuenta method, of class GestorCuenta.
     */
    @Test
    public void testGenerarNumeroDeCuenta() {
        System.out.println("generarNumeroDeCuenta");
        GestorCuenta instance = new GestorCuenta();
        int expResult = 0;
        int result = instance.generarNumeroDeCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeUsuario method, of class GestorCuenta.
     */
    @Test
    public void testExisteUsuario() {
        System.out.println("existeUsuario");
        String nombreUsuario = "";
        GestorCuenta instance = new GestorCuenta();
        boolean expResult = false;
        boolean result = instance.existeUsuario(nombreUsuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contrasenaCoincide method, of class GestorCuenta.
     */
    @Test
    public void testContrasenaCoincide() {
        System.out.println("contrasenaCoincide");
        char[] contrasena = null;
        GestorCuenta instance = new GestorCuenta();
        boolean expResult = false;
        boolean result = instance.contrasenaCoincide(contrasena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contrasenasCoinciden method, of class GestorCuenta.
     */
    @Test
    public void testContrasenasCoinciden() {
        System.out.println("contrasenasCoinciden");
        String nuevaContrasena = "";
        String contrasenaActual = "";
        GestorCuenta instance = new GestorCuenta();
        boolean expResult = false;
        boolean result = instance.contrasenasCoinciden(nuevaContrasena, contrasenaActual);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saldoDisponible method, of class GestorCuenta.
     */
    @Test
    public void testSaldoDisponible() {
        System.out.println("saldoDisponible");
        GestorCuenta instance = new GestorCuenta();
        String expResult = "";
        String result = instance.saldoDisponible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of depositar method, of class GestorCuenta.
     */
    @Test
    public void testDepositar_String_double() {
        System.out.println("depositar");
        String divisa = "";
        double montoDeposito = 0.0;
        GestorCuenta instance = new GestorCuenta();
        instance.depositar(divisa, montoDeposito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of depositar method, of class GestorCuenta.
     */
    @Test
    public void testDepositar_3args() {
        System.out.println("depositar");
        String divisa = "";
        double montoDeposito = 0.0;
        String nroCuenta = "";
        GestorCuenta instance = new GestorCuenta();
        instance.depositar(divisa, montoDeposito, nroCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class GestorCuenta.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        String divisa = "";
        double montoRetiro = 0.0;
        GestorCuenta instance = new GestorCuenta();
        instance.retirar(divisa, montoRetiro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transferir method, of class GestorCuenta.
     */
    @Test
    public void testTransferir() {
        System.out.println("transferir");
        String divisa = "";
        double montoATransferir = 0.0;
        String numeroCuentaDestino = "";
        GestorCuenta instance = new GestorCuenta();
        instance.transferir(divisa, montoATransferir, numeroCuentaDestino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTasaCambio method, of class GestorCuenta.
     */
    @Test
    public void testGetTasaCambio() {
        System.out.println("getTasaCambio");
        String divisaOrigen = "";
        String divisaDestino = "";
        GestorCuenta instance = new GestorCuenta();
        double expResult = 0.0;
        double result = instance.getTasaCambio(divisaOrigen, divisaDestino);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarContrasena method, of class GestorCuenta.
     */
    @Test
    public void testCambiarContrasena() {
        System.out.println("cambiarContrasena");
        char[] nuevaCont = null;
        char[] confirmacionCont = null;
        GestorCuenta instance = new GestorCuenta();
        boolean expResult = false;
        boolean result = instance.cambiarContrasena(nuevaCont, confirmacionCont);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extraerCuentaUsuario method, of class GestorCuenta.
     */
    @Test
    public void testExtraerCuentaUsuario() {
        System.out.println("extraerCuentaUsuario");
        String nombreUsuario = "";
        GestorCuenta instance = new GestorCuenta();
        instance.extraerCuentaUsuario(nombreUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuentas method, of class GestorCuenta.
     */
    @Test
    public void testGetCuentas() {
        System.out.println("getCuentas");
        GestorCuenta instance = new GestorCuenta();
        Cuenta[] expResult = null;
        Cuenta[] result = instance.getCuentas();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of establecerCuenta method, of class GestorCuenta.
     */
    @Test
    public void testEstablecerCuenta() {
        System.out.println("establecerCuenta");
        String numeroCuenta = "";
        GestorCuenta instance = new GestorCuenta();
        instance.establecerCuenta(numeroCuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonto method, of class GestorCuenta.
     */
    @Test
    public void testGetMonto() {
        System.out.println("getMonto");
        GestorCuenta instance = new GestorCuenta();
        String expResult = "";
        String result = instance.getMonto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDivisa method, of class GestorCuenta.
     */
    @Test
    public void testGetDivisa() {
        System.out.println("getDivisa");
        GestorCuenta instance = new GestorCuenta();
        String expResult = "";
        String result = instance.getDivisa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroCuenta method, of class GestorCuenta.
     */
    @Test
    public void testGetNroCuenta() {
        System.out.println("getNroCuenta");
        GestorCuenta instance = new GestorCuenta();
        String expResult = "";
        String result = instance.getNroCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMontoConvertido method, of class GestorCuenta.
     */
    @Test
    public void testGetMontoConvertido_String_double() {
        System.out.println("getMontoConvertido");
        String divisa = "";
        double monto = 0.0;
        GestorCuenta instance = new GestorCuenta();
        double expResult = 0.0;
        double result = instance.getMontoConvertido(divisa, monto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMontoConvertido method, of class GestorCuenta.
     */
    @Test
    public void testGetMontoConvertido_3args() {
        System.out.println("getMontoConvertido");
        String divisa = "";
        double monto = 0.0;
        String nroCuenta = "";
        GestorCuenta instance = new GestorCuenta();
        double expResult = 0.0;
        double result = instance.getMontoConvertido(divisa, monto, nroCuenta);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of titularCuenta method, of class GestorCuenta.
     */
    @Test
    public void testTitularCuenta() {
        System.out.println("titularCuenta");
        GestorCuenta instance = new GestorCuenta();
        String expResult = "";
        String result = instance.titularCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
