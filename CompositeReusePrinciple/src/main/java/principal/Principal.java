/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import principal.modelCerto.Funcionario;
import principal.modelErrado.FuncionarioErrado;
import principal.modelErrado.FuncionarioGerenteErrado;

/**
 *
 * @author artur
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FuncionarioErrado funcionarioErrado = new FuncionarioErrado("Marcos", 1000);
        FuncionarioGerenteErrado funcionarioGerenteErrado = new FuncionarioGerenteErrado("Paulo", 1000);
        
        System.out.println("Salario total do " + funcionarioErrado.getNome() + " é: " + funcionarioErrado.getSalarioTotal());
        System.out.println("Salario total do " + funcionarioGerenteErrado.getNome() + " é: " + funcionarioGerenteErrado.getSalarioTotal());
        
       
        
        Funcionario funcionario = new Funcionario("Amelia", 2000, "Vendedor");
        System.out.println("Salario total do " + funcionario.getNome() + " é: " + funcionario.getSalarioTotal());
       
        
    }
    
}
