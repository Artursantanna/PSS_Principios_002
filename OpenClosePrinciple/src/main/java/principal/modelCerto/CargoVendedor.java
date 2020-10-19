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
public class CargoVendedor implements CargoStrategy{
    private final String nome = "Vendedor";
    private double salarioBase;
    private int horaPorSemana;

    public CargoVendedor() {
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
        return salarioBase;
    }

    @Override
    public String nomeCargo() {
        return nome;
    }
    
    
    
    
    
    
    
}
