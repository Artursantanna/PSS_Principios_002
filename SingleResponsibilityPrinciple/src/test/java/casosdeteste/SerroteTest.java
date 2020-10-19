
package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.Serrote;

/**
 *
 * @author artur
 */
public class SerroteTest {
    
    public SerroteTest() {
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
    public void CT002() {
        Serrote serrote = new Serrote("Serrote de costas", 10);
        String tipoEsperado = "Serrote de costas";
        double tamanhoEsperado = 10;
        
        assertEquals(tipoEsperado, serrote.getTipo());
        assertEquals(tamanhoEsperado, serrote.getTamanho(), 0.001);
    }
}
