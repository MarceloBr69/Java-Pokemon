package com.Pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String nombre, int vida, String tipo) {
		return new Pokemon(nombre, vida, tipo);
	}
	public String pokemonInfo(Pokemon pokemon) {
		return "Nombre " + pokemon.getName() + ", sus puntos de vida son: " + pokemon.getHealth() + ", y su tipo es: " + pokemon.getType();
	}
}


