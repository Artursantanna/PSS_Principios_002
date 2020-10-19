package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.Martelo;
import principal.modelCerto.Trabalhador;

/**
 *
 * @author artur
 */
public class TrabalhadorTest {

    public TrabalhadorTest() {
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
        Trabalhador trabalhador = new Trabalhador("Paulo", "Vidraceiro");
        String nomeEsperado = "Paulo";
        String cargoEsperado = "Vidraceiro";
        
        assertEquals(nomeEsperado, trabalhador.getNome());
        assertEquals(cargoEsperado, trabalhador.getCargo());
        
    }
}
