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
public class Retangulo extends FiguraGeometrica{
    private double altura = 0;
    private double largura = 0;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    

    @Override
    public double area() {
        return largura * altura;
    }
    
}
