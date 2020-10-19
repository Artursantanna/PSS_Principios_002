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
public class CaixaDeFerramentas {
    private int quantidade;
    private final ArrayList<FerramentaStrategy> ferramentas = new ArrayList();

    public CaixaDeFerramentas() {
        this.quantidade = 0;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
    public void addFerramenta(FerramentaStrategy ferramenta){
        ferramentas.add(ferramenta);
        quantidade++;        
    }
    
}
