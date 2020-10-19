/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import principal.modelCerto.Carrinho;
import principal.modelCerto.Item;
import principal.modelCerto.Produto;
import principal.modelErrado.CarrinhoErrado;
import principal.modelErrado.ItemErrado;
import principal.modelErrado.ProdutoErrado;

/**
 *
 * @author artur
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("-----Teste modelo errado-----");
        ProdutoErrado produtoErrado1 = new ProdutoErrado(5.50, "Coca");
        ProdutoErrado produtoErrado2 = new ProdutoErrado(10, "Queijo");
        ProdutoErrado produtoErrado3 = new ProdutoErrado(6.90, "Pizza");
        
        ItemErrado itemErrado1 = new ItemErrado(produtoErrado1, 50);
        ItemErrado itemErrado2 = new ItemErrado(produtoErrado2, 50);
        ItemErrado itemErrado3 = new ItemErrado(produtoErrado3, 50);
        
        CarrinhoErrado carrinhoErrado = new CarrinhoErrado("Artur");
        carrinhoErrado.addItem(produtoErrado1, 6);
        carrinhoErrado.addItem(produtoErrado2, 1);
        carrinhoErrado.addItem(produtoErrado3, 2);
        System.out.println("Valor Total: " + carrinhoErrado.TotalValorItens());
        
        
        
        System.out.println("-----Teste modelo certo-----");
        Produto produto1 = new Produto(5.50, "Coca");
        Produto produto2 = new Produto(10, "Queijo");
        Produto produto3 = new Produto(6.90, "Pizza");
        
        Item item1 = new Item(produto1, 50);
        Item item2 = new Item(produto2, 50);
        Item item3 = new Item(produto3, 50);
        
        Carrinho carrinho = new Carrinho("Artur");
        carrinho.addItem(produto1, 6);
        carrinho.addItem(produto2, 1);
        carrinho.addItem(produto3, 2);
        System.out.println("Valor Total: " + carrinho.TotalValorItens());
        
        
        
    }
    
}
