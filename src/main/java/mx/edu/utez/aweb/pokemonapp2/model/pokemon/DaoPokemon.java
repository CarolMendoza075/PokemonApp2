package mx.edu.utez.aweb.pokemonapp2.model.pokemon;

import mx.edu.utez.aweb.pokemonapp2.utils.MySQLconnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoPokemon {
    Connection conn;
    PreparedStatement pstm;
    CallableStatement cstm;
    ResultSet rs;

    public List<BeanPokemon> findAll() {
        List<BeanPokemon> pokemons = new ArrayList<>(); //Retornar una lista, prepararla.
        BeanPokemon pokemon = null;
        try {
            conn = new MySQLconnection().getConnection();
            String query = "SELECT * FROM pokemons;";
            pstm = conn.prepareStatement(query);
            rs = pstm.executeQuery();
            while (rs.next()) {
                pokemon = new BeanPokemon();
                pokemon.setId(rs.getLong("Id"));
                pokemon.setName(rs.getString("name"));
                pokemon.setPokemonType(rs.getString("type"));
                pokemon.setHealth(rs.getDouble("health"));
                pokemon.setHeight(rs.getDouble("height"));
                pokemon.setPower(rs.getDouble("power"));
                pokemon.setWeight(rs.getDouble("weight"));
                pokemons.add(pokemon);
            }
        }catch (SQLException e) {

        }
        return pokemons;
    }
}
