/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import principal.modelCerto.FiguraGeometrica;
import principal.modelCerto.Quadrado;
import principal.modelCerto.Retangulo;
import principal.modelErrado.QuadradoErrado;
import principal.modelErrado.RetanguloErrado;

/**
 *
 * @author artur
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Codigo Errado
        RetanguloErrado retanguloErrado = new RetanguloErrado();
        retanguloErrado.setAltura(5);
        retanguloErrado.setLargura(4);
        System.out.println(retanguloErrado.area());
        
        RetanguloErrado quadradoErrado = new QuadradoErrado();
        quadradoErrado.setAltura(5);
        quadradoErrado.setLargura(4);
        System.out.println(quadradoErrado.area());
        
        //Codigo Correto
        FiguraGeometrica retangulo = new Retangulo(4 , 5);
        System.out.println(retangulo.area());
        
        FiguraGeometrica quadrado = new Quadrado(5);
        System.out.println(quadrado.area());
    }
    
}
