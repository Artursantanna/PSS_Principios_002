/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import principal.modelCerto.Hoppip;
import principal.modelCerto.Magikarp;
import principal.modelErrado.HoppipErrado;
import principal.modelErrado.MagikarpErrado;

/**
 *
 * @author artur
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //codigo errado
        MagikarpErrado magikarpErrado = new MagikarpErrado("Splash", 0, "Tackle", 40, "Flail", 0, "Bounce", 85);
        HoppipErrado hoppipErrado = new HoppipErrado("Splash", 0, "Tackle", 40, "Absorb", 20, "Bullet Seed", 25);
        System.out.println("Hoppip used " + hoppipErrado.getAtaque1() + " dano: " + hoppipErrado.getDanoAtaque1());
        
        //codigo correto
        Magikarp magikarp = new Magikarp();
        System.out.println(magikarp.useAtaque(0));
        Hoppip hoppip = new Hoppip();
        System.out.println(hoppip.useAtaque(3));
    }
    
}
