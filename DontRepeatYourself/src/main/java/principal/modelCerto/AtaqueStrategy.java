/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.modelCerto;

/**
 *
 * @author artur
 */
public abstract class AtaqueStrategy {
    private final String nome;
    private final double dano;

    public AtaqueStrategy(String nome, double dano) {
        this.nome = nome;
        this.dano = dano;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public double getDano() {
        return dano;
    }
    
}
