package com.Pokemon;

public class Pokemon {
	private String name;
	private String type; 
	private int health;
	private static int count = 0; 

	
	//Constructor
	public Pokemon(String nombre, int vida, String tipo) {
		this.name = nombre;
		this.health = vida;
		this.type = tipo;
		count++;
	}
	
	//Atack pokemon
	public void attackPokemon(Pokemon pokemon, String NombreDelPokemonAtacado) {
		pokemon.health -= 10;
		System.out.println("El Pokemon " + NombreDelPokemonAtacado + " Ha recibido 10 puntos de daño!");
	}
	
	
	
	
	//Getters and setters 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Pokemon.count = count;
	}
	

}
