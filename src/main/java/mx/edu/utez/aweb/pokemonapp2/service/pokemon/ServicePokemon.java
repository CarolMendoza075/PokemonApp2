package mx.edu.utez.aweb.pokemonapp2.service.pokemon;

import mx.edu.utez.aweb.pokemonapp2.model.pokemon.BeanPokemon;
import mx.edu.utez.aweb.pokemonapp2.model.pokemon.DaoPokemon;
import mx.edu.utez.aweb.pokemonapp2.utils.ResultAction;

import javax.xml.transform.Result;
import java.util.List;

public class ServicePokemon {
    DaoPokemon daoPokemon = new DaoPokemon();

    public List<BeanPokemon> getAll() {

        return daoPokemon.findAll();
    }

    public ResultAction save(BeanPokemon pokemon) {
        ResultAction result = new ResultAction();
        if(daoPokemon.save(pokemon)) {
            result.setResult(true);
            result.setMessage("Pokemon registrado correctamente");
            result.setStatus(200);
        }else {
            result.setResult(false);
            result.setMessage("Ocurrió un error al registrar");
            result.setStatus(400);
        }
        return result;
    }
}
