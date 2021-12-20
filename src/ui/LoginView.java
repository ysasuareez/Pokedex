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
import ui.RegistroView;


public class LoginView {

	private JFrame frameLoginView;
	private JLabel lblTituloInicio;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JButton btnIniciar;
	private JTextField tfUsername;
	private JButton btnRegistrar;
	private JPasswordField pfPassword;

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
		
		//Aqui se deben de poner las prop de las cosas visuales
		frameLoginView = new JFrame();		
		frameLoginView.getContentPane().setLayout(null);
		
		frameLoginView.setTitle("Men\u00FA Inicial");
		frameLoginView.setBounds(100, 100, 450, 300);
		frameLoginView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Titulo
		lblTituloInicio = new JLabel("POKEMON");	
		lblTituloInicio.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTituloInicio.setBounds(158, 22, 124, 49);
		frameLoginView.getContentPane().add(lblTituloInicio);
		
		//LABLE que indica que tiene que escribir el username
		lblUsername = new JLabel("USERNAME:");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(50, 84, 125, 25);
		frameLoginView.getContentPane().add(lblUsername);
		//donde se escribe el username
		tfUsername = new JTextField();
		tfUsername.setColumns(10);
		tfUsername.setBounds(185, 83, 146, 26);
		frameLoginView.getContentPane().add(tfUsername);
		
		//LABLE que indica que tiene que escribir la contraseña
		lblPassword = new JLabel("PASSWORD:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(50, 134, 125, 25);
		frameLoginView.getContentPane().add(lblPassword);
		//donde se escribe la contraseña
		pfPassword = new JPasswordField();		
		pfPassword.setBounds(185, 134, 146, 25);
		frameLoginView.getContentPane().add(pfPassword);

		
		//BOTON iniciar sesion
		this.btnIniciar = new JButton("Iniciar Sesi\u00F3n");
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 12));	
		btnIniciar.setBounds(103, 190, 109, 29);
		frameLoginView.getContentPane().add(btnIniciar);	
		
		//BOTON registrar
		btnRegistrar = new JButton("Registrar");		
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRegistrar.setBounds(222, 190, 109, 29);
		frameLoginView.getContentPane().add(btnRegistrar);
		
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

		//con intro se active el btnIniciar
		pfPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					comprobarDatos();
				}
			}
		});
		
		//Nos pasaría a la otra ventana para poder registrar nuestros datos en el almacen
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//eliminamos la ventana
				frameLoginView.setVisible(false);
				//llamamos a la RegistroView
				new RegistroView(frameLoginView);
			}
		});
	}
	
	//Metodo para comprobar los datos del Inicio de Sesion
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
					JOptionPane.showMessageDialog(btnIniciar, "        Login correcto. \nBienvenidx " + username);
					frameLoginView.setVisible(false);
					new PokedexView(frameLoginView);
				//o no.
				}else{
					JOptionPane.showMessageDialog(btnIniciar, "        Login incorrecto. \nIntroduzca sus datos correctamente o registrése si no posee una cuenta.");
					}														

	}	

}