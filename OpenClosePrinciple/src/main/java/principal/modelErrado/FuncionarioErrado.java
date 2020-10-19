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
public class FuncionarioErrado {
    private String nome;
    private String cargo;
    private double salario;

    public FuncionarioErrado(String nome, int cargo) {
        this.nome = nome;
        switch (cargo) {
            case 1:
                this.cargo = "vendedor";
                break;
            case 2:
                this.cargo = "gerente";
                break;
            default:
                throw new RuntimeException("Informe um cargo válido");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
    
    public void calculaSalario(){
        if ("vendedor" == this.cargo){
            this.salario = 1500;
        } else if("gerente" == this.cargo){
            this.salario = 1500 + 1500 * 0.2;
        }
    }
    
     @Override
    public String toString() {
        String retorno = "--------------- Funcionario --------------\n";
        retorno += nome + "\n";
        retorno += cargo + "\n";
        retorno += salario + "\n";

        return retorno;
    }
    
    
    
    
    
}
