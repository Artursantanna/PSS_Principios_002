
package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.ITelefoneCerto;
import principal.modelCerto.TelefoneComumCerto;

/**
 *
 * @author artur
 */
public class TelefoneComumTest {
    
    public TelefoneComumTest() {
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
        ITelefoneCerto telefoneComumCerto = new TelefoneComumCerto();
        telefoneComumCerto.TirarFoto();
    }
}
