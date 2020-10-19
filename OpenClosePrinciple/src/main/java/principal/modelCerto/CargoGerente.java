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
public class CargoGerente implements CargoStrategy{
    private final String nome = "Gerente";
    private double salarioBase;
    private int horaPorSemana;

    public CargoGerente() {
        this.salarioBase = 1500;
        this.horaPorSemana = 40;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getHoraPorSemana() {
        return horaPorSemana;
    }

    @Override
    public double calculaSalario() {
        return (salarioBase + (0.2 * salarioBase));
    }

    @Override
    public String nomeCargo() {
        return nome;
    }
    
}
