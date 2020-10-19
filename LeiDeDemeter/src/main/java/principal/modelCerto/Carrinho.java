/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.modelCerto;

import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class Carrinho {
    private final String comprador;
    private final ArrayList<Item> itens = new ArrayList<>();

    public Carrinho(String comprador) {
        this.comprador = comprador;
    }
    
     public final void addItem(Produto produto, double quantidade) {
        itens.add(new Item(produto, quantidade));
    }
    
    public double TotalValorItens() {
      double total = 0;
      for (Item item : itens) {
        total += item.valorTotal();
      }
      return total;
    }
    
}
