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
public class QuadradoErrado extends RetanguloErrado{

    public QuadradoErrado() {
        
    }

    @Override
    public void setLargura(double largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }

    @Override
    public void setAltura(double altura) {
        super.setAltura(altura);
        super.setLargura(altura);
    }
    
    
    
    
    
}
