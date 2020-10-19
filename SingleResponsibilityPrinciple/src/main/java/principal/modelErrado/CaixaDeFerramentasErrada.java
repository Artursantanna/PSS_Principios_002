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
public class CaixaDeFerramentasErrada {
    private int quantidade;

    public CaixaDeFerramentasErrada(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void chaveDeFenda(){
        System.out.println("Aperta Parafuso");
    }
    
    public void martelo(){
        System.out.println("Martela Prego");
    }
    
    public void serrote(){
        System.out.println("Serra Madeira");
    }
    
}
