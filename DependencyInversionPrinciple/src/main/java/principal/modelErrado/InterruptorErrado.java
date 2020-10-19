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
public class InterruptorErrado {

    private VentiladorErrado ventilador;

    public InterruptorErrado(VentiladorErrado ventilador) {
        this.ventilador = ventilador;
    }

    public void Acionar() {
        if (!ventilador.isLigado()) {
            ventilador.Ligar();
            System.out.println("Ventilador Ligado");
        } else {
            ventilador.Desligar();
            System.out.println("Ventilador Desligado");
        }
    }

}
