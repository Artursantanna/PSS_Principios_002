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
public class FuncionarioCerto {
    private final String nome;
    private final CargoStrategy cargo;
    private double salario;

    public FuncionarioCerto(String nome, CargoStrategy cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.calculaSalario();
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo.nomeCargo();
    }

    public double getSalario() {
        return salario;
    }
    
    public void calculaSalario(){
        salario = cargo.calculaSalario();
    }
    
     @Override
    public String toString() {
        String retorno = "--------------- Funcionario --------------\n";
        retorno += nome + "\n";
        retorno += cargo.nomeCargo() + "\n";
        retorno += salario + "\n";

        return retorno;
    }
    
}
