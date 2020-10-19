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
public class RetanguloErrado {
    private double altura = 0;
    private double largura = 0;
    
    public RetanguloErrado() {
        
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double area(){
        return altura * largura;
    }
    
}
