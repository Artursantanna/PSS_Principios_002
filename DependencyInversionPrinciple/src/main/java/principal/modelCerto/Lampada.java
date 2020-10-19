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
public class Lampada implements IDispositivoStrategy{
    
    private boolean ligado;

    public Lampada() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    } 
    

    @Override
    public void Ligar() {
        this.ligado = true;
    }

    @Override
    public void Desligar() {
        this.ligado = false;
    }
    
    @Override
    public void Acionar() {
        if (!this.isLigado()) {
            this.Ligar();
            System.out.println("Lampada Ligada");
        } else {
            this.Desligar();
            System.out.println("Lampada Desligada");
        }
    }
    
}
