package ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import models.Usuario;
import utils.Almacen;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class RegistroView {

	private JFrame frameRegistroView;
	private JLabel lblTituloRegistro;
	private JLabel lblNewUsername;
	private JTextField tfNewUsername;
	private JLabel lblNewPassword;
	private JLabel lblNewPassword2;
	private JButton btnVolverLogin;
	private JFrame parent;
	private JButton btnRegistrarNew;
	private JPasswordField pfNewPassword;
	private JPasswordField pfNewPassword2;
	/**
	 * Create the application.
	 */
	public RegistroView(JFrame parent) {
		initialize();
		this.parent = parent;
		frameRegistroView.setVisible(true);
		

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameRegistroView = new JFrame();
		frameRegistroView.getContentPane();
		configureUIComponents();
		configureListeners();
		
		
	}
	
	/**
	 * Componentes View
	 */
	private void configureUIComponents() {
		frameRegistroView = new JFrame();		
		frameRegistroView.getContentPane().setLayout(null);
		
		frameRegistroView.setTitle("Men\u00FA Registro");
		frameRegistroView.setBounds(100, 100, 450, 300);
		frameRegistroView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameRegistroView.setVisible(true);
		
		//TITULO
		lblTituloRegistro = new JLabel("REGISTRO");
		lblTituloRegistro.setBounds(153, 21, 107, 38);
		frameRegistroView.getContentPane().add(lblTituloRegistro);
		
		
		
		//LABLE que indica que tiene que escribir el nuevo username
		lblNewUsername = new JLabel("New Username");
		lblNewUsername.setBounds(62, 69, 102, 13);
		frameRegistroView.getContentPane().add(lblNewUsername);
		
		//donde se escribe el nuevo username
		tfNewUsername = new JTextField();
		tfNewUsername.setBounds(199, 66, 96, 19);
		frameRegistroView.getContentPane().add(tfNewUsername);
		tfNewUsername.setColumns(10);
		
		
		
		//LABLE que indica que tiene que escribir la nueva contraseña
		lblNewPassword = new JLabel("New Password");
		lblNewPassword.setBounds(62, 112, 136, 13);
		frameRegistroView.getContentPane().add(lblNewPassword);
		
		//donde se escribe la nueva contraseña
		pfNewPassword = new JPasswordField();
		pfNewPassword.setBounds(199, 109, 96, 19);
		frameRegistroView.getContentPane().add(pfNewPassword);
		
		
		
		//LABLE que indica que tiene que repetir la nueva contraseña
		lblNewPassword2 = new JLabel("Repeat Password");
		lblNewPassword2.setBounds(62, 157, 136, 13);
		frameRegistroView.getContentPane().add(lblNewPassword2);
		
		//donde se repite
		pfNewPassword2 = new JPasswordField();
		pfNewPassword2.setBounds(199, 154, 96, 19);
		frameRegistroView.getContentPane().add(pfNewPassword2);
		
		
		
		//BOTON registrar que añadira los campos en el arraylist
		btnVolverLogin = new JButton("Volver Login");
		btnVolverLogin.setBounds(241, 204, 107, 21);
		frameRegistroView.getContentPane().add(btnVolverLogin);
		
		btnRegistrarNew = new JButton("Registrar");
		btnRegistrarNew.setBounds(83, 204, 107, 21);
		frameRegistroView.getContentPane().add(btnRegistrarNew);
		
		
		

		

				
	}
	
		/**
		 * Métodos
		 */
		private void configureListeners() {
			
			//El botón de registrar si todo funciona haría visible de nuevo la pagina de Login
			btnVolverLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frameRegistroView.dispose();
					parent.setVisible(true);
					
				}				
			});
			
			//con intro se active el btnRegistrar
			pfNewPassword2.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						//Llamamos al método que controlará los datos.
						introducirDatos();
					}
				}
			});
			
			//Dará paso al registro si todo es correcto
			btnRegistrarNew.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//Llamamos al método que controlará los datos.
					introducirDatos();
				}
			});
			
			
		}

			
		
		//Metodo para controlar que los datos de Registro
		private void introducirDatos() {
			
			//Creamos las variables necesarias
			String username = tfNewUsername.getText();
			String password = new String (pfNewPassword.getPassword());
			String password2 = new String (pfNewPassword2.getPassword());
			boolean existe = false; 
			
			//Si las dos contraseñas instroducidas son distintas, lanzará mensaje y no se hará nada mas
			if (!password.equals(password2)) {												
				JOptionPane.showMessageDialog(btnRegistrarNew, "Las constraseñas no son iguales, vuelve a intentarlo.");
			//Si son iguales, valorará que no exista ningun username igual y además te indicará cuales son tus opciones en ese caso
			} else {		
				for(int i = 0; i < Almacen.lista_usuarios.size(); i++) {
					if(Almacen.lista_usuarios.get(i).getUsername().equals(username)) {
						JOptionPane.showMessageDialog(btnRegistrarNew, "Este usuario ya existe. \nCambie de username o vaya al Login");
						existe = true;
					}else {
						//El usuario no exite y además sus contraseñas son iguales, pasariamos a lo siguiente:
						existe = false;
					}
				}	
					//Se puede crear el usuario por lo que se añade al arrayList de users que tenemos en Almacén
					if(existe == false) {
						Almacen.lista_usuarios.add(new Usuario(username, password));
						JOptionPane.showMessageDialog(btnRegistrarNew, "Usuario creado con éxito. \nBienvenidx " + username);
						//Además nos llevará a la página de LoginView para pode iniciar sesión.
						frameRegistroView.dispose();
						parent.setVisible(true);
					
				}												
			}					
		}
			
	
}
