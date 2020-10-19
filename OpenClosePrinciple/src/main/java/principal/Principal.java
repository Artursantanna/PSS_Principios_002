/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import principal.modelCerto.CargoGerente;
import principal.modelCerto.CargoVendedor;
import principal.modelCerto.FuncionarioCerto;
import principal.modelErrado.FuncionarioErrado;

/**
 *
 * @author artur
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FuncionarioErrado funcionario = new FuncionarioErrado("Paulo", 2);
        funcionario.calculaSalario();
        System.out.println(funcionario.toString());
        
        
        
        CargoVendedor cargoVendedor = new CargoVendedor();
        CargoGerente cargoGerente = new CargoGerente();
        
        FuncionarioCerto funcionario2 = new FuncionarioCerto("Augusto", cargoVendedor);
        System.out.println(funcionario2.toString());
        
    }
    
}
