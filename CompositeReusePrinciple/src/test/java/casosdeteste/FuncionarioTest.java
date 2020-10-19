package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.Funcionario;

/**
 *
 * @author artur
 */
public class FuncionarioTest {

    public FuncionarioTest() {
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
        Funcionario funcionario = new Funcionario("Amelia", 2000, "Vendedor");
        String nomeEsperado = "Amelia";
        double salarioBaseEsperado = 2000;
        String cargoEsperado = "Vendedor";
        double salarioTotalEsperado = 2200;

        assertEquals(nomeEsperado, funcionario.getNome());
        assertEquals(cargoEsperado, funcionario.getCargo());
        assertEquals(salarioBaseEsperado, funcionario.getSalarioBase(), 0.001);
        assertEquals(salarioTotalEsperado, funcionario.getSalarioTotal(), 0.001);

    }

    @Test
    public void CT002() {
        Funcionario funcionario = new Funcionario("Amelia", 2000, "Gerente");
        String nomeEsperado = "Amelia";
        double salarioBaseEsperado = 2000;
        String cargoEsperado = "Gerente";
        double salarioTotalEsperado = 2400;

        assertEquals(nomeEsperado, funcionario.getNome());
        assertEquals(cargoEsperado, funcionario.getCargo());
        assertEquals(salarioBaseEsperado, funcionario.getSalarioBase(), 0.001);
        assertEquals(salarioTotalEsperado, funcionario.getSalarioTotal(), 0.001);

    }
}
