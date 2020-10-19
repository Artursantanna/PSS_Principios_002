package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.Martelo;

/**
 *
 * @author artur
 */
public class MarteloTest {

    public MarteloTest() {
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
    public void CT003() {
        Martelo martelo = new Martelo("Martelo de vidraceiro", 1);
        String tipoEsperado = "Martelo de vidraceiro";
        double tamanhoEsperado = 1;
        
        assertEquals(tipoEsperado, martelo.getTipo());
        assertEquals(tamanhoEsperado, martelo.getTamanho(), 0.001);
    }
}
