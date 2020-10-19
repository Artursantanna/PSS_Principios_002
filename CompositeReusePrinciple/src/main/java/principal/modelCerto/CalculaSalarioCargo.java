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
public class CalculaSalarioCargo implements ICalculaSalarioStrategy{

    @Override
    public double calculaSalario(Funcionario funcionario) {
        if("Gerente".equals(funcionario.getCargo())){
            return funcionario.getSalarioBase()*1.2;
        } else{
            return funcionario.getSalarioBase()*1.1;
        }
    } 
    
    
    
}
