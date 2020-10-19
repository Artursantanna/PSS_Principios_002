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
public class FuncionarioGerenteErrado extends FuncionarioErrado{
    
    public FuncionarioGerenteErrado(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calculaBonus() {
        return super.calculaBonus()* 1.2;
    }
    
    
    
    
    
}
