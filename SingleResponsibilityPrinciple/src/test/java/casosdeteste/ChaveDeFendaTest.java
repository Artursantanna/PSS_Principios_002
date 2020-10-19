
package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.ChaveDeFenda;

/**
 *
 * @author artur
 */
public class ChaveDeFendaTest {
    
    public ChaveDeFendaTest() {
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
    public void CT004() {
        ChaveDeFenda chaveDeFenda = new ChaveDeFenda("Chave Tradicional", 5.5);
        String tipoEsperado = "Chave Tradicional";
        double tamanhoEsperado = 5.5;
        
        assertEquals(tipoEsperado, chaveDeFenda.getTipo());
        assertEquals(tamanhoEsperado, chaveDeFenda.getTamanho(), 0.001);
    }
}
