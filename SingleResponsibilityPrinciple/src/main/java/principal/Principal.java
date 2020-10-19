package principal;

import principal.modelCerto.CaixaDeFerramentas;
import principal.modelCerto.ChaveDeFenda;
import principal.modelCerto.Martelo;
import principal.modelCerto.Serrote;
import principal.modelCerto.Trabalhador;
import principal.modelErrado.CaixaDeFerramentasErrada;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author artur
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Exemplo de saida errado");
        CaixaDeFerramentasErrada caixaDeFerramentasErrada = new CaixaDeFerramentasErrada(5);
        caixaDeFerramentasErrada.chaveDeFenda();
        caixaDeFerramentasErrada.martelo();
        System.out.println();
        
        
        
        System.out.println("Exemplo de saida correto");
        CaixaDeFerramentas caixaDeFerramentas = new CaixaDeFerramentas();
        ChaveDeFenda chaveDeFenda = new ChaveDeFenda("Chave Tradicional", 5.5);
        Martelo martelo = new Martelo("Martelo de vidraceiro", 1);
        Serrote serrote = new Serrote("Serrote de costas", 10);
        caixaDeFerramentas.addFerramenta(serrote);
        caixaDeFerramentas.addFerramenta(martelo);
        caixaDeFerramentas.addFerramenta(chaveDeFenda);
        
        Trabalhador trabalhador = new Trabalhador("Paulo", "Vidraceiro");
        trabalhador.trabalhar(martelo);
        
    }
    
}
