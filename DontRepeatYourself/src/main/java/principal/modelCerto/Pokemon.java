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
public abstract class Pokemon {

    private final String especiePokemon;
    private final AtaqueStrategy ataques[] = new AtaqueStrategy[4];

    public Pokemon(String especiePokemon, AtaqueStrategy ataque0, AtaqueStrategy ataque1, AtaqueStrategy ataque2, AtaqueStrategy ataque3) {
        this.especiePokemon = especiePokemon;
        this.ataques[0] = ataque0;
        this.ataques[1] = ataque1;
        this.ataques[2] = ataque2;
        this.ataques[3] = ataque3;
    }

    public void addAtaque(int espacoAtaque, AtaqueStrategy ataque) {
        ataques[espacoAtaque] = ataque;
    }
    
    public AtaqueStrategy getAtaque(int espacoAtaque){
        return ataques[espacoAtaque];
    }

    public String useAtaque(int espacoAtaque) {
        return especiePokemon + " used " + ataques[espacoAtaque].getNome() + " dano: " + ataques[espacoAtaque].getDano();
    }

}
