package main;

import enums.TiposPokemon;
import models.Pokemon;
import ui.LoginView;
import utils.Almacen;


public class MainAppPoke {
	public static void main(String[] args) {
		
	Pokemon Charmander = new Pokemon(1, "Charmander", TiposPokemon.Fuego, 0.6, 8.5, "Lagartija", "Mar llamas");
	Almacen.lista_pokemons.add(new Pokemon(Charmander));
	Pokemon Bulbasaur = new Pokemon(2, "Bulbasaur", TiposPokemon.Planta, 0.7, 6.9, "Semilla", "Espesura");
	Almacen.lista_pokemons.add(new Pokemon(Bulbasaur));
	Pokemon Squirtle = new Pokemon(3, "Squirtle", TiposPokemon.Agua, 0.5, 9.0, "Tortuguita", "Torrente");
	Almacen.lista_pokemons.add(new Pokemon(Squirtle));
	LoginView loginView = new LoginView();

	}
}
