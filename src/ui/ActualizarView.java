package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import enums.TiposPokemon;
import models.Pokemon;
import utils.Almacen;

public class ActualizarView {

	private JFrame frame;
	private JFrame frameActualizarView;
	private JFrame parent;
	private int numeroPokemon;
	private JLabel lblNumeroPokemon;
	private JLabel lblNumeroPokemon2;
	private JLabel lblNombre;
	private JLabel lblNombrePoke;
	private JLabel lblAltura;
	private JTextField tfAltura;
	private JLabel lblPeso;
	private JTextField tfPeso;
	private JLabel lblCategoria;
	private JTextField tfCategoria;
	private JLabel lblHabilidad;
	private JTextField tfHabilidad;
	private JButton btnVolver ;
	private JButton btnActualizar;
	private JLabel lblTipo1;
	private JLabel lblTipo2;
	private JComboBox comboBoxTipo1;
	private JComboBox comboBoxTipo2;
	private Panel regilla1;
	private Panel deco1;
	private Panel regilla1_1;
	private Panel deco2;
	private Panel regilla1_2;
	private Panel regilla1_3;
	private Panel decoIzq;
	private JPanel bordePantalla;
	private JPanel Pantalla;
	private JLabel lblImagen;
	private JPanel vertical ;
	private JPanel bordeCrear;
	private JPanel bordeVolver;
	private JPanel horizontal;
	private JButton btnMas;
	private JButton btnMenos;
	private JPanel bordeNone1;
	private JButton btnNone1;
	private JPanel bordeNone2;
	private JButton btnNone2;
	private Panel fondoBienvebido;
	private JLabel lblCreacionNuevoPokemon;
	private GroupLayout gl_bordePantalla;
	private JFrame lastLoginView;
	private String username;


	/**
	 * Create the application.
	 */
	public ActualizarView(JFrame lastLoginView, JFrame parent, String username, int numeroPokemon) {
		this.lastLoginView = lastLoginView;
		this.parent = parent;	
		this.username = username;
		this.numeroPokemon = numeroPokemon;
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		configureUIComponents();
		configureListeners();
	}
	
	private void configureUIComponents() {
		frameActualizarView = new JFrame();		
		frameActualizarView.getContentPane().setBackground(Color.RED);
		frameActualizarView.setBounds(100, 100, 500, 641);
		frameActualizarView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameActualizarView.getContentPane().setLayout(null);
		frameActualizarView.setVisible(true);
		
		//TITULO
		frameActualizarView.setTitle ("TALLER POKEMON");
		frameActualizarView.setBounds(100, 100, 500, 641);
		frameActualizarView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		deco1 = new Panel();
		deco1.setBackground(Color.RED);
		deco1.setBounds(227, 44, 10, 10);
		frameActualizarView.getContentPane().add(deco1);
		
		regilla1_3 = new Panel();
		regilla1_3.setBackground(Color.BLACK);
		regilla1_3.setBounds(378, 406, 30, 3);
		frameActualizarView.getContentPane().add(regilla1_3);
		
		regilla1_1 = new Panel();
		regilla1_1.setBackground(Color.BLACK);
		regilla1_1.setBounds(378, 399, 30, 3);
		frameActualizarView.getContentPane().add(regilla1_1);
		
		regilla1_2 = new Panel();
		regilla1_2.setBackground(Color.BLACK);
		regilla1_2.setBounds(378, 392, 30, 3);
		frameActualizarView.getContentPane().add(regilla1_2);
		
		decoIzq = new Panel();
		decoIzq.setBackground(Color.RED);
		decoIzq.setBounds(82, 387, 22, 22);
		frameActualizarView.getContentPane().add(decoIzq);
		
				//DECORACIÓN BORDE GRIS
				regilla1 = new Panel();
				regilla1.setBackground(Color.BLACK);
				regilla1.setBounds(378, 385, 30, 3);
				frameActualizarView.getContentPane().add(regilla1);
		
		deco2 = new Panel();
		deco2.setBackground(Color.RED);
		deco2.setBounds(257, 44, 10, 10);
		frameActualizarView.getContentPane().add(deco2);
		
		
		//BORDE GRIS
		bordePantalla = new JPanel();
		bordePantalla.setBackground(SystemColor.activeCaptionBorder);
		bordePantalla.setBounds(45, 30, 401, 386);
		frameActualizarView.getContentPane().add(bordePantalla);
		
				
				
		//PANTALLA
		Pantalla = new JPanel();
		Pantalla.setLayout(null);
		Pantalla.setForeground(Color.BLACK);
		Pantalla.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		Pantalla.setBackground(Color.WHITE);
		
		gl_bordePantalla = new GroupLayout(bordePantalla);
		gl_bordePantalla.setHorizontalGroup(
			gl_bordePantalla.createParallelGroup(Alignment.LEADING)
				.addGap(0, 401, Short.MAX_VALUE)
				.addGroup(gl_bordePantalla.createSequentialGroup()
					.addGap(37)
					.addComponent(Pantalla, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		gl_bordePantalla.setVerticalGroup(
			gl_bordePantalla.createParallelGroup(Alignment.LEADING)
				.addGap(0, 386, Short.MAX_VALUE)
				.addGroup(gl_bordePantalla.createSequentialGroup()
					.addGap(32)
					.addComponent(Pantalla, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		
			//DENTRO DE PANTALLA
				//NÚMERO
				lblNumeroPokemon = new JLabel("N\u00FAmero:");
				lblNumeroPokemon.setHorizontalAlignment(SwingConstants.LEFT);
				lblNumeroPokemon.setBounds(48, 21, 157, 13);
				Pantalla.add(lblNumeroPokemon);
				lblNumeroPokemon.setFont(new Font("Alef", Font.PLAIN, 16));
				
				lblNumeroPokemon2 = new JLabel("" + numeroPokemon + 1);
				lblNumeroPokemon2.setBounds(189, 21, 45, 13);
				Pantalla.add(lblNumeroPokemon2);
				lblNumeroPokemon2.setFont(new Font("Courier New", Font.PLAIN, 13));
				
				//NOMBRE
				lblNombre = new JLabel("Nombre:");
				lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
				lblNombre.setBounds(50, 56, 155, 13);
				Pantalla.add(lblNombre);
				lblNombre.setFont(new Font("Alef", Font.PLAIN, 16));
				
				lblNombrePoke = new JLabel (Almacen.lista_pokemons.get(numeroPokemon).getNombre());
				lblNombrePoke.setBounds(189, 53, 96, 19);
				Pantalla.add(lblNombrePoke);
				lblNombrePoke.setFont(new Font("Courier New", Font.PLAIN, 13));

				
				
				//ALTURA
				lblAltura = new JLabel("Altura:");
				lblAltura.setHorizontalAlignment(SwingConstants.LEFT);
				lblAltura.setBounds(49, 92, 156, 13);
				Pantalla.add(lblAltura);
				lblAltura.setFont(new Font("Alef", Font.PLAIN, 16));
				
				tfAltura = new JTextField();
				tfAltura.setText("" + Almacen.lista_pokemons.get(numeroPokemon).getAltura());
				tfAltura.setBounds(189, 89, 96, 19);
				Pantalla.add(tfAltura);
				tfAltura.setFont(new Font("Courier New", Font.PLAIN, 13));
				tfAltura.setColumns(10);
				
				//PESO
				lblPeso = new JLabel("Peso:");
				lblPeso.setHorizontalAlignment(SwingConstants.LEFT);
				lblPeso.setBounds(50, 129, 155, 13);
				Pantalla.add(lblPeso);
				lblPeso.setFont(new Font("Alef", Font.PLAIN, 16));
				
				tfPeso = new JTextField();
				tfPeso.setText(""+Almacen.lista_pokemons.get(numeroPokemon).getPeso());
				tfPeso.setBounds(189, 126, 96, 19);
				Pantalla.add(tfPeso);
				tfPeso.setFont(new Font("Courier New", Font.PLAIN, 13));
				tfPeso.setColumns(10);
				
				//CATEGORÍA
				lblCategoria = new JLabel("Categoria:");
				lblCategoria.setHorizontalAlignment(SwingConstants.LEFT);
				lblCategoria.setBounds(49, 165, 156, 13);
				Pantalla.add(lblCategoria);
				lblCategoria.setFont(new Font("Alef", Font.PLAIN, 16));
				
				tfCategoria = new JTextField();
				tfCategoria.setText("" + Almacen.lista_pokemons.get(numeroPokemon).getCategoria());
				tfCategoria.setBounds(189, 162, 96, 19);
				Pantalla.add(tfCategoria);
				tfCategoria.setFont(new Font("Courier New", Font.PLAIN, 13));
				tfCategoria.setColumns(10);
				bordePantalla.setLayout(gl_bordePantalla);
				
				//HABILIDAD
				lblHabilidad = new JLabel("Habilidad:");
				lblHabilidad.setHorizontalAlignment(SwingConstants.LEFT);
				lblHabilidad.setBounds(50, 202, 155, 13);
				Pantalla.add(lblHabilidad);
				lblHabilidad.setFont(new Font("Alef", Font.PLAIN, 16));
								
				tfHabilidad = new JTextField();
				tfHabilidad.setText("" + Almacen.lista_pokemons.get(numeroPokemon).getHabilidad());
				tfHabilidad.setBounds(189, 199, 96, 19);
				Pantalla.add(tfHabilidad);
				tfHabilidad.setFont(new Font("Courier New", Font.PLAIN, 13));
				tfHabilidad.setColumns(10);
				
				//TIPOS
				lblTipo1 = new JLabel("Tipo 1:");
				lblTipo1.setHorizontalAlignment(SwingConstants.LEFT);
				lblTipo1.setBounds(49, 238, 156, 13);
				Pantalla.add(lblTipo1);
				lblTipo1.setFont(new Font("Alef", Font.PLAIN, 16));
				
				comboBoxTipo1 = new JComboBox(TiposPokemon.values());
				comboBoxTipo1.setBounds(189, 234, 96, 21);
				Pantalla.add(comboBoxTipo1);
				comboBoxTipo1.setFont(new Font("Courier New", Font.PLAIN, 13));
				
				
				lblTipo2 = new JLabel("Tipo 2:");
				lblTipo2.setHorizontalAlignment(SwingConstants.LEFT);
				lblTipo2.setBounds(49, 269, 156, 13);
				Pantalla.add(lblTipo2);
				lblTipo2.setFont(new Font("Alef", Font.PLAIN, 16));
				
				comboBoxTipo2 = new JComboBox(TiposPokemon.values());
				comboBoxTipo2.setBounds(189, 265, 96, 21);
				Pantalla.add(comboBoxTipo2);
				comboBoxTipo2.setFont(new Font("Courier New", Font.PLAIN, 13));
				
		
		//BOTÓN CREAR		
		bordeCrear = new JPanel();
		bordeCrear.setLayout(null);
		bordeCrear.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bordeCrear.setBackground(new Color(0, 153, 255));
		bordeCrear.setBounds(45, 448, 109, 23);
		frameActualizarView.getContentPane().add(bordeCrear);
		
		btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBounds(-14, -13, 137, 49);
		bordeCrear.add(btnActualizar);
		btnActualizar.setFont(new Font("Alef", Font.BOLD, 14));
		btnActualizar.setForeground(new Color(255, 255, 255));
		btnActualizar.setBackground(new Color(102, 153, 204));
		
		//BOTÓN VOLVER
		bordeVolver = new JPanel();
		bordeVolver.setLayout(null);
		bordeVolver.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bordeVolver.setBackground(new Color(204, 0, 0));
		bordeVolver.setBounds(188, 448, 107, 23);
		frameActualizarView.getContentPane().add(bordeVolver);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setBackground(new Color(51, 51, 51));
		btnVolver.setBounds(-14, -13, 137, 49);
		bordeVolver.add(btnVolver);
		btnVolver.setFont(new Font("Alef", Font.BOLD, 14));
		btnVolver.setForeground(new Color(255, 255, 255));
		
		//BOTONES SIN USO
		bordeNone1 = new JPanel();
		bordeNone1.setLayout(null);
		bordeNone1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bordeNone1.setBackground(new Color(204, 0, 0));
		bordeNone1.setBounds(47, 488, 107, 23);
		frameActualizarView.getContentPane().add(bordeNone1);
		
		btnNone1 = new JButton("");
		btnNone1.setForeground(Color.WHITE);
		btnNone1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNone1.setEnabled(false);
		btnNone1.setBackground(new Color(51, 51, 51));
		btnNone1.setBounds(-14, -13, 137, 49);
		bordeNone1.add(btnNone1);
		
		bordeNone2 = new JPanel();
		bordeNone2.setLayout(null);
		bordeNone2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bordeNone2.setBackground(new Color(0, 153, 255));
		bordeNone2.setBounds(188, 488, 109, 23);
		frameActualizarView.getContentPane().add(bordeNone2);

		btnNone2 = new JButton("");
		btnNone2.setToolTipText("");
		btnNone2.setForeground(Color.WHITE);
		btnNone2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNone2.setEnabled(false);
		btnNone2.setBackground(new Color(102, 153, 204));
		btnNone2.setBounds(-14, -13, 137, 49);
		bordeNone2.add(btnNone2);
		
		//DECORACIÓN DIRECCIONES 
		vertical = new JPanel();
		vertical.setLayout(null);
		vertical.setBackground(Color.BLACK);
		vertical.setBounds(366, 448, 40, 120);
		frameActualizarView.getContentPane().add(vertical);
		
		horizontal = new JPanel();
		horizontal.setLayout(null);
		horizontal.setBackground(Color.BLACK);
		horizontal.setBounds(326, 488, 120, 40);
		frameActualizarView.getContentPane().add(horizontal);
		
			//BOTON SIGUIENTE (NO USO)
			btnMas = new JButton(">");
			btnMas.setForeground(new Color(153, 153, 153));
			btnMas.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnMas.setEnabled(false);
			btnMas.setBackground(Color.BLACK);
			btnMas.setBounds(77, -2, 45, 45);
			horizontal.add(btnMas);
			
			//BOTON ANTERIOR (NO USO)
			btnMenos = new JButton("<");
			btnMenos.setForeground(new Color(153, 153, 153));
			btnMenos.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnMenos.setEnabled(false);
			btnMenos.setBackground(Color.BLACK);
			btnMenos.setBounds(-2, -2, 45, 45);
			horizontal.add(btnMenos);
		
		

		//PANEL VERDE Y SU MENSAJE 
		fondoBienvebido = new Panel();
		fondoBienvebido.setLayout(null);
		fondoBienvebido.setBackground(new Color(0, 204, 102));
		fondoBienvebido.setBounds(47, 528, 250, 40);
		frameActualizarView.getContentPane().add(fondoBienvebido);
		
		lblCreacionNuevoPokemon = new JLabel("ACTUALIZACI\u00D3N POKEMON");
		lblCreacionNuevoPokemon.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreacionNuevoPokemon.setForeground(Color.WHITE);
		lblCreacionNuevoPokemon.setFont(new Font("Courier New", Font.PLAIN, 16));
		lblCreacionNuevoPokemon.setBounds(0, 0, 250, 40);
		fondoBienvebido.add(lblCreacionNuevoPokemon);
	}

	/**
	 * Métodos
	 */
	private void configureListeners() {
		
		//Vuelve a la PokedexView
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameActualizarView.dispose();
				parent.setVisible(true);
			}
		});
		
		//Activa el método comprobarDatos(), que actualizara los datos del pokemon
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarDatos();
			}
		});
		
	}
	
	/*
	 * Método que comprobara si los datos introducidos del pokemon son correctos, es decir, 
	 * si dicho pokemon ya existe o si el Tipo no cumple las condiciones
	 */
	private void actualizarDatos() {
		//Metemos los datos escritos en variables
		TiposPokemon tipo1 = (TiposPokemon)comboBoxTipo1.getSelectedItem();
		TiposPokemon tipo2 = (TiposPokemon)comboBoxTipo2.getSelectedItem();
		double altura = Double.parseDouble(tfAltura.getText());
		double peso = Double.parseDouble(tfPeso.getText());
		String categoria = tfCategoria.getText();
		String habilidad = tfHabilidad.getText();		

		//Llamamos a los setters para cambiarlos
		Almacen.lista_pokemons.get(numeroPokemon).setTipo1(tipo1);
		Almacen.lista_pokemons.get(numeroPokemon).setTipo2(tipo2);
		Almacen.lista_pokemons.get(numeroPokemon).setAltura(altura);
		Almacen.lista_pokemons.get(numeroPokemon).setPeso(peso);
		Almacen.lista_pokemons.get(numeroPokemon).setCategoria(categoria);
		Almacen.lista_pokemons.get(numeroPokemon).setHabilidad(habilidad);
		
		JOptionPane.showMessageDialog(btnActualizar, "Pokemon actualizado con éxito.");
		
		frameActualizarView.dispose();
		new PokedexView(lastLoginView, username, numeroPokemon);

			}
	
		
	}

