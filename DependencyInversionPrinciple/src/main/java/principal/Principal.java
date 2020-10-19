/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import principal.modelCerto.Interruptor;
import principal.modelCerto.Lampada;
import principal.modelCerto.Ventilador;
import principal.modelErrado.InterruptorErrado;
import principal.modelErrado.VentiladorErrado;

/**
 *
 * @author artur
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VentiladorErrado ventiladorErrado = new VentiladorErrado();
        InterruptorErrado interruptorErrado = new InterruptorErrado(ventiladorErrado);
        interruptorErrado.Acionar();
        interruptorErrado.Acionar();
        
        Ventilador ventilador = new Ventilador();
        Lampada lampada = new Lampada();
        Interruptor interruptorV = new Interruptor(ventilador);
        Interruptor interruptorL = new Interruptor(lampada);
        
        interruptorV.AcionarDispositivo();
        interruptorV.AcionarDispositivo();
        
        interruptorL.AcionarDispositivo();
        interruptorL.AcionarDispositivo();

    }
    
}
