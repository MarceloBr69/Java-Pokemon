package com.Pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokedex pokedex = new Pokedex();
		
		Pokemon lucario = pokedex.createPokemon("Lucario", 10, "Lucha y Acero"); 
		pokedex.addPokemon(lucario);
		
		Pokemon emolga = pokedex.createPokemon("Emolga", 30, "Electrico y Volador"); 
		pokedex.addPokemon(emolga);
		
		Pokemon bisharp = pokedex.createPokemon("Bisharp", 300, "Siniestro y Acero");
		pokedex.addPokemon(bisharp);
		
		bisharp.attackPokemon(emolga, "Emolga"); 
		System.out.println("La vida de Emolga ahora es de: " + emolga.getHealth());
		
		pokedex.listPokemon();
		System.out.println("El numero de pokemones creados es de: " + pokedex.getPokemonCount());
		
		

	}

}
