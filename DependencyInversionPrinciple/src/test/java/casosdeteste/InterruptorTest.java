
package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.Interruptor;
import principal.modelCerto.Lampada;
import principal.modelCerto.Ventilador;

/**
 *
 * @author artur
 */
public class InterruptorTest {
    
    public InterruptorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void CT001() {
        Ventilador ventilador = new Ventilador();
        Lampada lampada = new Lampada();
        boolean estadoVentiladorEsperado = false;
        boolean estadoLampadaEsperado = false;
        assertEquals(estadoVentiladorEsperado, ventilador.isLigado());
        assertEquals(estadoLampadaEsperado, lampada.isLigado());
        
        Interruptor interruptorV = new Interruptor(ventilador);
        Interruptor interruptorL = new Interruptor(lampada);        
        interruptorV.AcionarDispositivo();
        interruptorL.AcionarDispositivo();
        estadoVentiladorEsperado = true;
        estadoLampadaEsperado = true;
        assertEquals(estadoVentiladorEsperado, ventilador.isLigado());
        assertEquals(estadoLampadaEsperado, lampada.isLigado());
    }
}
