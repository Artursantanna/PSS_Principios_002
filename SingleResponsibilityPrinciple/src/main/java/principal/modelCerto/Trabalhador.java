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
public class Trabalhador {
    private final String nome;
    private final String cargo;

    public Trabalhador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
    
    public void trabalhar(FerramentaStrategy ferramenta){
        System.out.print("Trabalhador " + nome + " ");
        ferramenta.usarFerramenta();
    }
    
}
