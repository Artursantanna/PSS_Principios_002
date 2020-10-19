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
    private final String nome;
    private final double salarioBase;
    private final double salarioTotal;

    public FuncionarioErrado(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.salarioTotal = this.calculaBonus();
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
    
    public double calculaBonus(){
        return salarioBase * 1.1;
    }
}
