
package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.CaixaDeFerramentas;
import principal.modelCerto.ChaveDeFenda;
import principal.modelCerto.Martelo;
import principal.modelCerto.Serrote;

/**
 *
 * @author artur
 */
public class CaixaDeFerramentasTest {
    
    public CaixaDeFerramentasTest() {
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
    public void CT005() {
        CaixaDeFerramentas caixaDeFerramentas = new CaixaDeFerramentas();
        ChaveDeFenda chaveDeFenda = new ChaveDeFenda("Chave Tradicional", 5.5);
        Martelo martelo = new Martelo("Martelo de vidraceiro", 1);
        Serrote serrote = new Serrote("Serrote de costas", 10);
        caixaDeFerramentas.addFerramenta(serrote);
        caixaDeFerramentas.addFerramenta(martelo);
        caixaDeFerramentas.addFerramenta(chaveDeFenda);
        
        int quantidadeEsperada = 3;
        assertEquals(quantidadeEsperada, caixaDeFerramentas.getQuantidade());
    }
}
