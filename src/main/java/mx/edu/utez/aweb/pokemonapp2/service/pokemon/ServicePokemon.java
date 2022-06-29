package mx.edu.utez.aweb.pokemonapp2.service.pokemon;

import mx.edu.utez.aweb.pokemonapp2.model.pokemon.BeanPokemon;
import mx.edu.utez.aweb.pokemonapp2.model.pokemon.DaoPokemon;

import java.util.List;

public class ServicePokemon {
    DaoPokemon daoPokemon = new DaoPokemon();

    public List<BeanPokemon> getAll() {
        return daoPokemon.findAll();
    }
}
