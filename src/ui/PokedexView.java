package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import utils.Almacen;
import java.awt.Font;
import ui.LoginView;

public class PokedexView {

	private int numeroPokemon;
	private JFrame framePokedexView;
	private JLabel lblNombre;
	private JFrame frameLoginView;
	private JLabel lblTipo;
	private JLabel lblTipoPoke;
	private JButton btnMenos;
	private JButton btnMas;
	private JLabel lblImagen;	
	private JFrame parent;
	private JLabel lblAltura;
	private JLabel lblAlturaPoke;
	private JLabel lblPeso;
	private JLabel lblPesoPoke;
	private JLabel lblNombrePoke;
	private JLabel lblCategoria;
	private JLabel lblCategoriaPoke;
	private JLabel lblHabilidad;
	private JLabel lblNewLabel;
	private JButton btnActualizar;
	private JButton btnBorrar;
	private JButton btnCrear;
	private JButton btnCerrarSesion;
	private String username;



	/**
	 * Create the application.
	 */
	public PokedexView(JFrame parent) {
		initialize();
		this.parent = parent;
		framePokedexView.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framePokedexView = new JFrame();
		framePokedexView.getContentPane();
		configureUIComponents();
		configureListeners();
	}
	

	/**
	 * Componentes View 
	 */
	private void configureUIComponents() {
		framePokedexView = new JFrame();
		framePokedexView.getContentPane().setLayout(null);
		
		
		//TITULO
		framePokedexView.setTitle("POKEDEX");
		framePokedexView.setBounds(100, 100, 694, 463);
		framePokedexView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePokedexView.setVisible(true);
		
		//NOMBRE
		lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(203, 51, 45, 13);
		framePokedexView.getContentPane().add(lblNombre);
		
		lblNombrePoke = new JLabel(Almacen.lista_pokemons.get(numeroPokemon).getNombre());
		lblNombrePoke.setBounds(272, 51, 45, 13);
		framePokedexView.getContentPane().add(lblNombrePoke);
		
		//TIPO
		lblTipo = new JLabel("Tipo:");
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setBounds(203, 68, 45, 13);
		framePokedexView.getContentPane().add(lblTipo);
		
		lblTipoPoke = new JLabel("" + Almacen.lista_pokemons.get(numeroPokemon).getMiTipo());
		lblTipoPoke.setBounds(272, 68, 45, 13);
		framePokedexView.getContentPane().add(lblTipoPoke);
		
		//ALTURA
		lblAltura = new JLabel("Altura:");
		lblAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAltura.setBounds(62, 324, 103, 13);
		framePokedexView.getContentPane().add(lblAltura);
		
		lblAlturaPoke = new JLabel("" + Almacen.lista_pokemons.get(numeroPokemon).getAltura());
		lblAlturaPoke.setBounds(189, 324, 113, 13);
		framePokedexView.getContentPane().add(lblAlturaPoke);
		
		//PESO
		lblPeso = new JLabel("Peso:");
		lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeso.setBounds(72, 347, 93, 13);
		framePokedexView.getContentPane().add(lblPeso);
		
		lblPesoPoke = new JLabel(""+Almacen.lista_pokemons.get(numeroPokemon).getPeso());
		lblPesoPoke.setBounds(189, 347, 113, 13);
		framePokedexView.getContentPane().add(lblPesoPoke);		

		//CATEGORIA
		lblCategoria = new JLabel("Categoria:");
		lblCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategoria.setBounds(272, 322, 70, 13);
		framePokedexView.getContentPane().add(lblCategoria);
		
		lblCategoriaPoke = new JLabel(Almacen.lista_pokemons.get(numeroPokemon).getCategoria());
		lblCategoriaPoke.setBounds(366, 322, 113, 13);
		framePokedexView.getContentPane().add(lblCategoriaPoke);
		
		//HABILIDAD
		lblHabilidad = new JLabel("Habilidad:");
		lblHabilidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHabilidad.setBounds(272, 347, 70, 13);
		framePokedexView.getContentPane().add(lblHabilidad);
		
		lblNewLabel = new JLabel(Almacen.lista_pokemons.get(numeroPokemon).getHabilidad());
		lblNewLabel.setBounds(366, 345, 192, 13);
		framePokedexView.getContentPane().add(lblNewLabel);
		
		
		//BOTON ACTUALIZAR
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(538, 221, 103, 21);
		framePokedexView.getContentPane().add(btnActualizar);
		
		//BOTON BORRAR 
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(538, 159, 103, 21);
		framePokedexView.getContentPane().add(btnBorrar);
		
		btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//BOTON CREAR
		btnCrear.setBounds(538, 105, 103, 21);
		framePokedexView.getContentPane().add(btnCrear);

		btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesion.setBounds(538, 284, 103, 21);
		framePokedexView.getContentPane().add(btnCerrarSesion);
		
		//ANTERIOR
		btnMenos = new JButton("-");
		btnMenos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMenos.setBounds(54, 189, 43, 43);
		framePokedexView.getContentPane().add(btnMenos);
		
		//SIGUIENTE
		btnMas = new JButton("+");
		btnMas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMas.setBounds(411, 189, 43, 43);
		framePokedexView.getContentPane().add(btnMas);
		
		//IMAGEN
		lblImagen = new JLabel("Imagen no disponible");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setBounds(197, 191, 120, 43);
		framePokedexView.getContentPane().add(lblImagen);
		

	}
	
	/**
	 * Métodos
	 */
	private void configureListeners() {

			btnCerrarSesion.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					framePokedexView.dispose();
					parent.setVisible(true);
				}
			});
			
			btnBorrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Almacen.lista_pokemons.remove(numeroPokemon);
				}
			});
			
			btnMenos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numeroPokemon--;
				}
			});
			
			btnMas.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numeroPokemon++;
				}
			});
			
			btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				}
			});
			
	}
}
