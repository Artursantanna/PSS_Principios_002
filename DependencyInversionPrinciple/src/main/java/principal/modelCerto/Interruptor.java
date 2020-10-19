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
public class Interruptor {
    
    private final IDispositivoStrategy dispositivo;

    public Interruptor(IDispositivoStrategy dispositivo) {
        this.dispositivo = dispositivo;
    }
    
    public void AcionarDispositivo(){
        dispositivo.Acionar();
    }
    
}
