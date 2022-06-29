package mx.edu.utez.aweb.pokemonapp2.model.pokemon;

import mx.edu.utez.aweb.pokemonapp2.model.ability.BeanAbility;

import java.util.List;

public class BeanPokemon {
    private long id;
    private String name;
    private double health;
    private double power;
    private double weight;
    private double height;
    private String pokemonType;

    private List<BeanAbility> abilities;

    public BeanPokemon() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public List<BeanAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<BeanAbility> abilities) {
        this.abilities = abilities;
    }
}
