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
public class Funcionario {
    private final String nome;
    private final double salarioBase;
    private final double salarioTotal;
    private final String cargo;
    private final ICalculaSalarioStrategy tipoCalculoSalario;

    public Funcionario(String nome, double salarioBase, String cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
        this.tipoCalculoSalario = new CalculaSalarioCargo();
        this.salarioTotal = this.tipoCalculoSalario.calculaSalario(this);
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

    public String getCargo() {
        return cargo;
    }
}
