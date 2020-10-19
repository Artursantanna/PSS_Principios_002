/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.modelErrado;

/**
 *
 * @author artur
 */
public class ItemErrado {
    
    private final ProdutoErrado produto;
    private final double quantidade;

    public ItemErrado(ProdutoErrado produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ProdutoErrado getProduto() {
        return produto;
    }

    public double getQuantidade() {
        return quantidade;
    }
    
}
