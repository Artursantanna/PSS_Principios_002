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
public class TelefoneComumErrado implements ITelefoneErrado{

    @Override
    public void Tocar() {
    }

    @Override
    public void Discar() {
    }

    @Override
    public void TirarFoto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
