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
public class TelefoneCelularCerto extends TelefoneAdapter{

    @Override
    public void Tocar() {
        System.out.println("Tocar");
    }

    @Override
    public void Discar() {
        System.out.println("Realizar discagem");
    }

    @Override
    public void TirarFoto() {
        System.out.println("Tirar foto");
    }

}
