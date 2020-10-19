/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import principal.modelCerto.ITelefoneCerto;
import principal.modelCerto.TelefoneComumCerto;
import principal.modelErrado.TelefoneComumErrado;

/**
 *
 * @author artur
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelefoneComumErrado telefoneComum = new TelefoneComumErrado();
        //Assim o principio é quebrado.
        //telefoneComum.TirarFoto();
        
        
        ITelefoneCerto telefoneComumCerto = new TelefoneComumCerto();
        telefoneComumCerto.Discar();
    }
    
}
