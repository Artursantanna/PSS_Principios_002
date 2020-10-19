package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.FiguraGeometrica;
import principal.modelCerto.Quadrado;
import principal.modelCerto.Retangulo;

/**
 *
 * @author artur
 */
public class FiguraGeometricaTest {

    public FiguraGeometricaTest() {
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
        FiguraGeometrica retangulo = new Retangulo(4 , 5);
        double areaRetanguloEsperada = 20;
        assertEquals(areaRetanguloEsperada, retangulo.area(), 0.001);
        
        
        FiguraGeometrica quadrado = new Quadrado(5);
        double areaQuadradoEsperada = 25;
        assertEquals(areaQuadradoEsperada, quadrado.area(), 0.001);
        
    }
}
