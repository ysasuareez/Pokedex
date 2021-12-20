package models;

import enums.TiposPokemon;

public class Pokemon {
	
	/**
	 * ATRIBUTOS
	 */
	private int numero;
	private String nombre;
	private TiposPokemon miTipo;
	private double altura;
	private double peso;
	private String categoria;
	private String habilidad;
	
	
	/**
	 * CONSTRUCTOR
	 * @param numero
	 * @param nombre
	 * @param tipo
	 * @param altura
	 * @param peso
	 * @param categoria
	 * @param habilidad
	 */
	public Pokemon(int numero, String nombre, TiposPokemon tipo, double altura, double peso, String categoria,
			String habilidad) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.miTipo = tipo;
		this.altura = altura;
		this.peso = peso;
		this.categoria = categoria;
		this.habilidad = habilidad;
	}


	public Pokemon(Pokemon nombrePokemon) {

	}


	/**
	 * G & S
	 */
	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public TiposPokemon getMiTipo() {
		return miTipo;
	}



	public void setMiTipo(TiposPokemon miTipo) {
		this.miTipo = miTipo;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public String getHabilidad() {
		return habilidad;
	}



	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	

}
