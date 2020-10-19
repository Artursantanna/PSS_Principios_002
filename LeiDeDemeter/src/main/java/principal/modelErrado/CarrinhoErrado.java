/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.modelErrado;

import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class CarrinhoErrado {
    private final String comprador;
    private final ArrayList<ItemErrado> itens = new ArrayList<>();

    public CarrinhoErrado(String comprador) {
        this.comprador = comprador;
    }
    
     public final void addItem(ProdutoErrado produto, double quantidade) {
        itens.add(new ItemErrado(produto, quantidade));
    }
    
    public double TotalValorItens() {
      double total = 0;
      for (ItemErrado item : itens) {
        total += item.getProduto().getValor() * item.getQuantidade();
      }
      return total;
    }
    
}
