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
public class Martelo implements FerramentaStrategy{
    
    private final String tipo;
    private final double tamanho;

    public Martelo(String tipo, double tamanho) {
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public double getTamanho() {
        return tamanho;
    }  
    

    @Override
    public void usarFerramenta() {
        System.out.println("Martela Prego");
    }  
}
