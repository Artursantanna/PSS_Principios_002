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
public class VentiladorErrado {
    
    private boolean ligado;

    public VentiladorErrado() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    } 
    

    public void Ligar() {
        this.ligado = true;
    }

    public void Desligar() {
        this.ligado = false;
    }

}
