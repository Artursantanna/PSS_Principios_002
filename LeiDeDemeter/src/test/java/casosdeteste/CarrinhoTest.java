
package casosdeteste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import principal.modelCerto.Carrinho;
import principal.modelCerto.Item;
import principal.modelCerto.Produto;

/**
 *
 * @author artur
 */
public class CarrinhoTest {
    
    public CarrinhoTest() {
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
        Produto produto1 = new Produto(5.50, "Coca");
        Produto produto2 = new Produto(10, "Queijo");
        Produto produto3 = new Produto(6.90, "Pizza");
        String nomeProdutoEsperado = "Coca";
        assertEquals(nomeProdutoEsperado, produto1.getNome());
        
        Item item1 = new Item(produto1, 10);
        double quantidadeItemEsperado = 10;
        double valorTotalItemEsperado = 55;
        assertEquals(quantidadeItemEsperado, item1.getQuantidade(), 0.001);
        assertEquals(valorTotalItemEsperado, item1.valorTotal(), 0.001);
        
        Carrinho carrinho = new Carrinho("Artur");
        carrinho.addItem(produto1, 10);
        carrinho.addItem(produto2, 1);
        carrinho.addItem(produto3, 1);
        double valorTotalCarrinhoEsperado = 71.90;
        assertEquals(valorTotalCarrinhoEsperado, carrinho.TotalValorItens(), 0.001);
        
        
    }
}
