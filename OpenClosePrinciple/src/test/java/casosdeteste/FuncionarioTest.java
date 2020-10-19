
package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.CargoGerente;
import principal.modelCerto.CargoVendedor;
import principal.modelCerto.FuncionarioCerto;

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
        CargoVendedor cargoVendedor = new CargoVendedor();
        
        FuncionarioCerto funcionario = new FuncionarioCerto("Augusto", cargoVendedor);
        String nomeEsperado = "Augusto";
        String cargoEsperado = "Vendedor";
        double salarioEsperado = 1500.00;
        
        assertEquals(nomeEsperado, funcionario.getNome());
        assertEquals(cargoEsperado, funcionario.getCargo());
        assertEquals(salarioEsperado, funcionario.getSalario(), 0.001);
    }
    
    @Test
    public void CT002() {
        CargoGerente cargoGerente = new CargoGerente();
        FuncionarioCerto funcionario = new FuncionarioCerto("Augusto", cargoGerente);
        String nomeEsperado = "Augusto";
        String cargoEsperado = "Gerente";
        double salarioEsperado = 1800.00;
        
        assertEquals(nomeEsperado, funcionario.getNome());
        assertEquals(cargoEsperado, funcionario.getCargo());
        assertEquals(salarioEsperado, funcionario.getSalario(), 0.001);
        
    }
}
