package ui;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

import utils.Almacen;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import ui.RegistrarView;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import java.awt.Button;
import java.awt.Panel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;


public class LoginView {

	private JFrame frameLoginView;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JButton btnIniciar;
	private JTextField tfUsername;
	private JButton btnRegistrar;
	private JPasswordField pfPassword;
	private JPanel Pantalla;
	private JButton btnMas;
	private JButton btnMenos;
	private JPanel vertical;
	private JPanel bordeIniciar;
	private JPanel bordeRegistrar;
	private JPanel bordeNone1;
	private JButton btnNone1;
	private JPanel bordeNone2;
	private JButton btnNone2;
	private Panel fondoBienvebido;
	private JLabel lblBienvenido;
	private Panel deco1_1;
	private Panel deco2_1;
	private Panel decoIzq_1;
	private Panel regilla1_4;
	private Panel regilla1_5;
	private Panel regilla1_6;
	private Panel regilla1_7;
	private JLabel lblImagen;
	private JPanel bordePantalla;
	private GroupLayout gl_bordePantalla;
	private JPanel horizontal;

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
		this.frameLoginView.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLoginView = new  JFrame();
		frameLoginView.getContentPane();
		configureUIComponents();		
		configureListeners();

		
	}

	/**
	 * Componentes View 
	 */
	private void configureUIComponents() {
		
		
		frameLoginView = new JFrame();		
		frameLoginView.getContentPane().setBackground(Color.RED);
		frameLoginView.getContentPane().setLayout(null);
		
		//TITULO
		frameLoginView.setTitle("Men\u00FA Inicial");
		frameLoginView.setBounds(100, 100, 500, 641);
		frameLoginView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		decoIzq_1 = new Panel();
		decoIzq_1.setBounds(82, 387, 22, 22);
		frameLoginView.getContentPane().add(decoIzq_1);
		
				//DECORACIÓN BORDE GRIS
				regilla1_7 = new Panel();
				regilla1_7.setBackground(Color.BLACK);
				regilla1_7.setBounds(378, 385, 30, 3);
				frameLoginView.getContentPane().add(regilla1_7);
		
		deco2_1 = new Panel();
		deco2_1.setBounds(257, 44, 10, 10);
		frameLoginView.getContentPane().add(deco2_1);
		
		regilla1_5 = new Panel();
		regilla1_5.setBackground(Color.BLACK);
		regilla1_5.setBounds(378, 399, 30, 3);
		frameLoginView.getContentPane().add(regilla1_5);
		
		regilla1_6 = new Panel();
		regilla1_6.setBackground(Color.BLACK);
		regilla1_6.setBounds(378, 392, 30, 3);
		frameLoginView.getContentPane().add(regilla1_6);
		
		regilla1_4 = new Panel();
		regilla1_4.setBackground(Color.BLACK);
		regilla1_4.setBounds(378, 406, 30, 3);
		frameLoginView.getContentPane().add(regilla1_4);
		
		deco1_1 = new Panel();
		deco1_1.setBounds(227, 44, 10, 10);
		frameLoginView.getContentPane().add(deco1_1);
		
		//BORDE GRIS
		bordePantalla = new JPanel();
		bordePantalla.setBackground(SystemColor.activeCaptionBorder);
		bordePantalla.setBounds(45, 30, 401, 386);
		frameLoginView.getContentPane().add(bordePantalla);
				
		Pantalla = new JPanel();
		Pantalla.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		Pantalla.setBackground(new Color(255, 255, 255));
		Pantalla.setForeground(new Color(0, 0, 0));
		
		gl_bordePantalla = new GroupLayout(bordePantalla);
		gl_bordePantalla.setHorizontalGroup(
			gl_bordePantalla.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bordePantalla.createSequentialGroup()
					.addGap(37)
					.addComponent(Pantalla, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		gl_bordePantalla.setVerticalGroup(
			gl_bordePantalla.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bordePantalla.createSequentialGroup()
					.addGap(32)
					.addComponent(Pantalla, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		
		Pantalla.setLayout(null);
		
			//DENTRO DE PANTALLA
				//USERNAME
				lblUsername = new JLabel("Username:");
				lblUsername.setBounds(10, 160, 125, 25);
				Pantalla.add(lblUsername);
				lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
				lblUsername.setFont(new Font("Alef", Font.PLAIN, 16));

				tfUsername = new JTextField();
				tfUsername.setFont(new Font("Courier New", Font.PLAIN, 13));
				tfUsername.setBounds(145, 159, 131, 26);
				Pantalla.add(tfUsername);
				tfUsername.setColumns(10);
				
				//PASSWORD
				pfPassword = new JPasswordField();
				pfPassword.setFont(new Font("Courier New", Font.PLAIN, 13));
				pfPassword.setBounds(145, 195, 131, 25);
				Pantalla.add(pfPassword);
				
				lblPassword = new JLabel("Password:");
				lblPassword.setBounds(10, 195, 125, 25);
				Pantalla.add(lblPassword);
				lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
				lblPassword.setFont(new Font("Alef", Font.PLAIN, 16));
				
				//LOGO POKEMON
				lblImagen = new JLabel("");
				lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
				lblImagen.setIcon(new ImageIcon("Imagenes/LOGO.png"));
				lblImagen.setBounds(10, 22, 307, 124);
				Pantalla.add(lblImagen);
				bordePantalla.setLayout(gl_bordePantalla);
		
		
		
		//BOTON INICIAR
		bordeIniciar = new JPanel();
		bordeIniciar.setBackground(new Color(0, 153, 255));
		bordeIniciar.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bordeIniciar.setBounds(45, 448, 109, 23);
		frameLoginView.getContentPane().add(bordeIniciar);
		bordeIniciar.setLayout(null);
										
		btnIniciar = new JButton("INICIAR");
		btnIniciar.setBounds(-14, -13, 137, 49);
		bordeIniciar.add(btnIniciar);
		btnIniciar.setToolTipText("");
		btnIniciar.setForeground(Color.WHITE);
		btnIniciar.setBackground(new Color(102, 153, 204));
		btnIniciar.setFont(new Font("Alef", Font.BOLD, 14));
		
		//BOTON REGISTRAR
		bordeRegistrar = new JPanel();
		bordeRegistrar.setBackground(new Color(204, 0, 0));
		bordeRegistrar.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bordeRegistrar.setBounds(188, 448, 107, 23);
		frameLoginView.getContentPane().add(bordeRegistrar);
		bordeRegistrar.setLayout(null);
		
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(-14, -13, 137, 49);
		bordeRegistrar.add(btnRegistrar);
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setBackground(new Color(51, 51, 51));
		btnRegistrar.setFont(new Font("Alef", Font.BOLD, 14));
		
		//BOTONES SIN USO
		bordeNone1 = new JPanel();
		bordeNone1.setLayout(null);
		bordeNone1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bordeNone1.setBackground(new Color(204, 0, 0));
		bordeNone1.setBounds(47, 488, 107, 23);
		frameLoginView.getContentPane().add(bordeNone1);
		
		btnNone1 = new JButton("");
		btnNone1.setEnabled(false);
		btnNone1.setForeground(Color.WHITE);
		btnNone1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNone1.setBackground(new Color(51, 51, 51));
		btnNone1.setBounds(-14, -13, 137, 49);
		bordeNone1.add(btnNone1);
		
		bordeNone2 = new JPanel();
		bordeNone2.setLayout(null);
		bordeNone2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bordeNone2.setBackground(new Color(0, 153, 255));
		bordeNone2.setBounds(188, 488, 109, 23);
		frameLoginView.getContentPane().add(bordeNone2);
				
		btnNone2 = new JButton("");
		btnNone2.setEnabled(false);
		btnNone2.setToolTipText("");
		btnNone2.setForeground(Color.WHITE);
		btnNone2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNone2.setBackground(new Color(102, 153, 204));
		btnNone2.setBounds(-14, -13, 137, 49);
		bordeNone2.add(btnNone2);
				
		
		//DECORACIÓN DIRECCIONES 
		vertical = new JPanel();
		vertical.setBackground(Color.BLACK);
		vertical.setBounds(366, 448, 40, 120);
		frameLoginView.getContentPane().add(vertical);
		vertical.setLayout(null);
		
		horizontal = new JPanel();
		horizontal.setBackground(new Color(0, 0, 0));
		horizontal.setBounds(326, 488, 120, 40);
		frameLoginView.getContentPane().add(horizontal);
		horizontal.setLayout(null);
		
				//BOTON SIGUIENTE (NO USO)
				btnMas = new JButton(">");
				btnMas.setEnabled(false);
				btnMas.setBounds(77, -2, 45, 45);
				horizontal.add(btnMas);
				btnMas.setBackground(new Color(0, 0, 0));
				btnMas.setForeground(new Color(153, 153, 153));
				btnMas.setFont(new Font("Tahoma", Font.BOLD, 13));
				
				//BOTON ANTERIOR (NO USO)
				btnMenos = new JButton("<");
				btnMenos.setEnabled(false);
				btnMenos.setBounds(-2, -2, 45, 45);
				horizontal.add(btnMenos);
				btnMenos.setForeground(new Color(153, 153, 153));
				btnMenos.setBackground(new Color(0, 0, 0));
				btnMenos.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		//PANEL VERDE Y SU MENSAJE 
		fondoBienvebido = new Panel();
		fondoBienvebido.setBackground(new Color(0, 204, 102));
		fondoBienvebido.setBounds(47, 528, 250, 40);
		frameLoginView.getContentPane().add(fondoBienvebido);
		fondoBienvebido.setLayout(null);
		
		lblBienvenido = new JLabel("BIENVENIDO");
		lblBienvenido.setFont(new Font("Courier New", Font.PLAIN, 20));
		lblBienvenido.setForeground(new Color(255, 255, 255));
		lblBienvenido.setBounds(60, 8, 127, 25);
		fondoBienvebido.add(lblBienvenido);
		
	}
	
	/**
	 * Métodos
	 */
	
	private void configureListeners() {
		
		//Hacemos que el boton de Iniciar compruebe (gracias al metodo) si los datos se encuentran en el Almacen y coinciden
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprobarDatos();			
			}
		});

		//con intro se simula la activacion del btnIniciar
		pfPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					comprobarDatos();
				}
			}
		});
		
		//con intro se activa el btnIniciar
		btnIniciar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					comprobarDatos();
				}
			}
		});
		
		//con intro se activa la RegistroView
		btnRegistrar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				new RegistrarView(frameLoginView);
			}
		});
		
		//Nos pasaría a la otra ventana para poder registrar nuestros datos en el almacen
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//eliminamos la ventana
				frameLoginView.setVisible(false);
				//llamamos a la RegistroView
				new RegistrarView(frameLoginView);
			}
		});
	}
	
	//Método para comprobar los datos del Inicio de Sesion
	private void comprobarDatos() {
		
				//Este String me devuelve lo que haya escrito en el tf de usuario y el siguiente en pfUsuername solo que la forma es distinta
				String username = tfUsername.getText();
				String password = new String (pfPassword.getPassword());
				boolean encontrado = false;
				

				//Recorremos el array de los usuarios para poder comprobar lo siguiente:
				for(int i = 0; i < Almacen.lista_usuarios.size(); i++) {
					// Si xiste usuario
					if(Almacen.lista_usuarios.get(i).getUsername().equals(username) && Almacen.lista_usuarios.get(i).getPassword().equals(password)) {
						encontrado = true;
					}
				}
				
				//y si existe podrá iniciar sesión
				if(encontrado) {
					JOptionPane.showMessageDialog(btnIniciar, "LOGIN CORRECTO \nBienvenidx " + username);
					frameLoginView.setVisible(false);
					new PokedexView(frameLoginView, username, 0);
				//o no.
				}else{
					JOptionPane.showMessageDialog(btnIniciar, "           LOGIN INCORRECTO. \nIntroduzca sus datos correctamente \no registrése si no posee una cuenta.");
					}														

	}	
}