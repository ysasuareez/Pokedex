package main;

import javax.swing.ImageIcon;

import enums.TiposPokemon;
import models.Pokemon;
import models.Usuario;
import ui.LoginView;
import utils.Almacen;

public class MainAppPoke {
	public static void main(String[] args) {
		
	Almacen.lista_usuarios.add(new Usuario("y", "y"));
	Almacen.lista_pokemons.add(new Pokemon(0, "Charmander", TiposPokemon.Fuego, TiposPokemon.Ninguno, 0.6, 8.5, "Lagartija", "Mar llamas", "Imagenes/Charmander.png"));
	Almacen.lista_pokemons.add(new Pokemon(1, "Bulbasaur", TiposPokemon.Planta, TiposPokemon.Ninguno,  0.7, 6.9, "Semilla", "Espesura", "Imagenes/Bulbasaur.png"));
	Almacen.lista_pokemons.add(new Pokemon(2, "Squirtle", TiposPokemon.Agua, TiposPokemon.Ninguno, 0.5, 9.0, "Tortuguita", "Torrente", "Imagenes/Squirtle.png"));

	LoginView loginView = new LoginView();

	}
}
