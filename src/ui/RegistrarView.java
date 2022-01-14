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
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class RegistrarView {

	private JFrame frameRegistrarView;
	private JLabel lblNewUsername;
	private JTextField tfNewUsername;
	private JLabel lblNewPassword;
	private JLabel lblNewPassword2;
	private JButton btnVolverLogin;
	private JFrame parent;
	private JButton btnRegistrarNew;
	private JPasswordField pfNewPassword;
	private JPasswordField pfNewPassword2;
	private JPanel vertical;
	private JPanel bordeRegistrar;
	private JPanel bordeVolver;
	private JPanel horizontal;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JPanel bordeNone1;
	private JButton btnNone1;
	private JPanel bordeNone2;
	private JButton btnIniciar_1;
	private Panel fondoBienvebido;
	private JLabel lblBienvenido;
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
	/**
	 * Create the application.
	 */
	public RegistrarView(JFrame parent) {
		initialize();
		this.parent = parent;	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		configureUIComponents();
		configureListeners();
		
		
	}
	
	/**
	 * Componentes View
	 */
	private void configureUIComponents() {
		frameRegistrarView = new JFrame();		
		frameRegistrarView.getContentPane().setBackground(Color.RED);
		frameRegistrarView.getContentPane().setLayout(null);
		
		frameRegistrarView.setTitle("Men\u00FA Registro");
		frameRegistrarView.setBounds(100, 100, 500, 641);
		frameRegistrarView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameRegistrarView.setVisible(true);
		
		vertical = new JPanel();
		vertical.setLayout(null);
		vertical.setBackground(Color.BLACK);
		vertical.setBounds(366, 448, 40, 120);
		frameRegistrarView.getContentPane().add(vertical);
		
		bordeRegistrar = new JPanel();
		bordeRegistrar.setLayout(null);
		bordeRegistrar.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bordeRegistrar.setBackground(new Color(0, 153, 255));
		bordeRegistrar.setBounds(45, 448, 109, 23);
		frameRegistrarView.getContentPane().add(bordeRegistrar);
		
		btnRegistrarNew = new JButton("REGISTRAR");
		btnRegistrarNew.setForeground(new Color(255, 255, 255));
		btnRegistrarNew.setFont(new Font("Alef", Font.BOLD, 14));
		btnRegistrarNew.setBackground(new Color(102, 153, 204));
		btnRegistrarNew.setBounds(-14, -13, 137, 49);
		bordeRegistrar.add(btnRegistrarNew);
		
		bordeVolver = new JPanel();
		bordeVolver.setLayout(null);
		bordeVolver.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bordeVolver.setBackground(new Color(204, 0, 0));
		bordeVolver.setBounds(188, 448, 107, 23);
		frameRegistrarView.getContentPane().add(bordeVolver);
		
		
		
		//BOTON registrar que añadira los campos en el arraylist
		btnVolverLogin = new JButton("VOLVER");
		btnVolverLogin.setFont(new Font("Alef", Font.BOLD, 14));
		btnVolverLogin.setForeground(new Color(255, 255, 255));
		btnVolverLogin.setBackground(new Color(51, 51, 51));
		btnVolverLogin.setBounds(-14, -13, 137, 49);
		bordeVolver.add(btnVolverLogin);
		
		horizontal = new JPanel();
		horizontal.setLayout(null);
		horizontal.setBackground(Color.BLACK);
		horizontal.setBounds(326, 488, 120, 40);
		frameRegistrarView.getContentPane().add(horizontal);
		
		btnNewButton = new JButton(">");
		btnNewButton.setForeground(new Color(153, 153, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setEnabled(false);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(77, -2, 45, 45);
		horizontal.add(btnNewButton);
		
		btnNewButton_1 = new JButton("<");
		btnNewButton_1.setForeground(new Color(153, 153, 153));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(-2, -2, 45, 45);
		horizontal.add(btnNewButton_1);
		
		bordeNone1 = new JPanel();
		bordeNone1.setLayout(null);
		bordeNone1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		bordeNone1.setBackground(new Color(204, 0, 0));
		bordeNone1.setBounds(47, 488, 107, 23);
		frameRegistrarView.getContentPane().add(bordeNone1);
		
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
		frameRegistrarView.getContentPane().add(bordeNone2);
		
		btnIniciar_1 = new JButton("");
		btnIniciar_1.setToolTipText("");
		btnIniciar_1.setForeground(Color.WHITE);
		btnIniciar_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnIniciar_1.setEnabled(false);
		btnIniciar_1.setBackground(new Color(102, 153, 204));
		btnIniciar_1.setBounds(-14, -13, 137, 49);
		bordeNone2.add(btnIniciar_1);
		
		fondoBienvebido = new Panel();
		fondoBienvebido.setLayout(null);
		fondoBienvebido.setBackground(new Color(0, 204, 102));
		fondoBienvebido.setBounds(47, 528, 250, 40);
		frameRegistrarView.getContentPane().add(fondoBienvebido);
		
		lblBienvenido = new JLabel("REGISTRO NUEVO ENTRENADOR");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setForeground(Color.WHITE);
		lblBienvenido.setFont(new Font("Courier New", Font.PLAIN, 16));
		lblBienvenido.setBounds(0, 0, 250, 40);
		fondoBienvebido.add(lblBienvenido);
		
		regilla1 = new Panel();
		regilla1.setBackground(Color.BLACK);
		regilla1.setBounds(378, 385, 30, 3);
		frameRegistrarView.getContentPane().add(regilla1);
		
		deco1 = new Panel();
		deco1.setBackground(Color.RED);
		deco1.setBounds(227, 44, 10, 10);
		frameRegistrarView.getContentPane().add(deco1);
		
		regilla1_1 = new Panel();
		regilla1_1.setBackground(Color.BLACK);
		regilla1_1.setBounds(378, 399, 30, 3);
		frameRegistrarView.getContentPane().add(regilla1_1);
		
		deco2 = new Panel();
		deco2.setBackground(Color.RED);
		deco2.setBounds(257, 44, 10, 10);
		frameRegistrarView.getContentPane().add(deco2);
		
		regilla1_2 = new Panel();
		regilla1_2.setBackground(Color.BLACK);
		regilla1_2.setBounds(378, 392, 30, 3);
		frameRegistrarView.getContentPane().add(regilla1_2);
		
		regilla1_3 = new Panel();
		regilla1_3.setBackground(Color.BLACK);
		regilla1_3.setBounds(378, 406, 30, 3);
		frameRegistrarView.getContentPane().add(regilla1_3);
		
		decoIzq = new Panel();
		decoIzq.setBackground(Color.RED);
		decoIzq.setBounds(82, 387, 22, 22);
		frameRegistrarView.getContentPane().add(decoIzq);
		
		bordePantalla = new JPanel();
		bordePantalla.setBackground(SystemColor.activeCaptionBorder);
		bordePantalla.setBounds(45, 30, 401, 386);
		frameRegistrarView.getContentPane().add(bordePantalla);
		
		Pantalla = new JPanel();
		Pantalla.setLayout(null);
		Pantalla.setForeground(Color.BLACK);
		Pantalla.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		Pantalla.setBackground(Color.WHITE);
		GroupLayout gl_bordePantalla = new GroupLayout(bordePantalla);
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
		
		
		
		//LABLE que indica que tiene que escribir el nuevo username
		lblNewUsername = new JLabel("New Username:");
		lblNewUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewUsername.setFont(new Font("Alef", Font.PLAIN, 16));
		lblNewUsername.setBounds(25, 159, 125, 31);
		Pantalla.add(lblNewUsername);
		
		//donde se escribe el nuevo username
		tfNewUsername = new JTextField();
		tfNewUsername.setFont(new Font("Courier New", Font.PLAIN, 13));
		tfNewUsername.setBounds(160, 165, 131, 24);
		Pantalla.add(tfNewUsername);
		tfNewUsername.setColumns(10);
		
		
		
		//LABLE que indica que tiene que escribir la nueva contraseña
		lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewPassword.setFont(new Font("Alef", Font.PLAIN, 16));
		lblNewPassword.setBounds(25, 200, 125, 31);
		Pantalla.add(lblNewPassword);
		
		//donde se escribe la nueva contraseña
		pfNewPassword = new JPasswordField();
		pfNewPassword.setFont(new Font("Courier New", Font.PLAIN, 13));
		pfNewPassword.setBounds(160, 206, 131, 24);
		Pantalla.add(pfNewPassword);
		
		
		
		//LABLE que indica que tiene que repetir la nueva contraseña
		lblNewPassword2 = new JLabel("Repeat Password:");
		lblNewPassword2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewPassword2.setFont(new Font("Alef", Font.PLAIN, 16));
		lblNewPassword2.setBounds(20, 241, 130, 31);
		Pantalla.add(lblNewPassword2);
		
		//donde se repite
		pfNewPassword2 = new JPasswordField();
		pfNewPassword2.setFont(new Font("Courier New", Font.PLAIN, 13));
		pfNewPassword2.setBounds(160, 247, 131, 24);
		Pantalla.add(pfNewPassword2);
		
		lblImagen = new JLabel("");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setIcon(new ImageIcon("Imagenes/LOGO.png"));
		lblImagen.setBounds(10, 22, 307, 124);
		Pantalla.add(lblImagen);
		bordePantalla.setLayout(gl_bordePantalla);
		
		
		

		

				
	}
	
		/**
		 * Métodos
		 */
		private void configureListeners() {
			
			//El botón de registrar si todo funciona haría visible de nuevo la pagina de Login
			btnVolverLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frameRegistrarView.dispose();
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
			
			//con intro se activa el btnIniciar
			btnRegistrarNew.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode() == KeyEvent.VK_ENTER) {
						introducirDatos();
					}
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
						frameRegistrarView.dispose();
						parent.setVisible(true);
					
				}												
			}					
		}
}
