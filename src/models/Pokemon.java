package models;


import javax.swing.ImageIcon;

import enums.TiposPokemon;

public class Pokemon {
	
	/**
	 * ATRIBUTOS
	 */
	private int numeroPokemon;
	private String nombre;
	private TiposPokemon tipo1;
	private TiposPokemon tipo2;
	private double altura;
	private double peso;
	private String categoria;
	private String habilidad;
	private String imagen;
	
	
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
	public Pokemon(int numeroPokemon, String nombre, TiposPokemon tipo1, TiposPokemon tipo2, double altura, double peso, String categoria,String habilidad, String imagen) {
		super();
		this.numeroPokemon = numeroPokemon;
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.altura = altura;
		this.peso = peso;
		this.categoria = categoria;
		this.habilidad = habilidad;
		this.imagen = imagen;
		
	}


	/**
	 * G & S
	 */
	public int getNumero() {
		return numeroPokemon;
	}



	public void setNumero(int numeroPokemon) {
		this.numeroPokemon = numeroPokemon;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public TiposPokemon getTipo1() {
		return tipo1;
	}



	public void setTipo1(TiposPokemon tipo1) {
		this.tipo1 = tipo1;
	}

	public TiposPokemon getTipo2() {
		return tipo2;
	}



	public void setTipo2(TiposPokemon tipo2) {
		this.tipo2 = tipo2;
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
	
	
	public String getImagen() {
		return imagen;
	}



	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	

}