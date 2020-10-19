package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.AtaqueBounce;
import principal.modelCerto.Hoppip;
import principal.modelCerto.Magikarp;

/**
 *
 * @author artur
 */
public class PokemonTest {

    public PokemonTest() {
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
        Magikarp magikarp = new Magikarp();
        double ataqueDanoEsperado = 0;
        assertEquals(ataqueDanoEsperado, magikarp.getAtaque(0).getDano(), 0.001);

        String ataqueNomeEsperado = "Splash";
        assertEquals(ataqueNomeEsperado, magikarp.getAtaque(0).getNome());
    }

    @Test
    public void CT002() {
        Hoppip hoppip = new Hoppip();
        double ataqueDanoEsperado = 25;
        assertEquals(ataqueDanoEsperado, hoppip.getAtaque(3).getDano(), 0.001);

        String ataqueNomeEsperado = "Bullet Seed";
        assertEquals(ataqueNomeEsperado, hoppip.getAtaque(3).getNome());
    }
    
    @Test
    public void CT003() {
        Hoppip hoppip = new Hoppip();
        hoppip.addAtaque(3, new AtaqueBounce());
        double ataqueDanoEsperado = 85;
        assertEquals(ataqueDanoEsperado, hoppip.getAtaque(3).getDano(), 0.001);

        String ataqueNomeEsperado = "Bounce";
        assertEquals(ataqueNomeEsperado, hoppip.getAtaque(3).getNome());
    }
    
    @Test
    public void CT004() {
        Hoppip hoppip = new Hoppip();
        String useAtaqueEsperado = "Hoppip used Bullet Seed dano: 25.0";
        assertEquals(useAtaqueEsperado, hoppip.useAtaque(3));
    }
}
