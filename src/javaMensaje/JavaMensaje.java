package javaMensaje;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class JavaMensaje {

	private JFrame frmEjemploRemoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaMensaje window = new JavaMensaje();
					window.frmEjemploRemoto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaMensaje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjemploRemoto = new JFrame();
		frmEjemploRemoto.setTitle("Ejemplo remoto");
		frmEjemploRemoto.setBounds(100, 100, 450, 300);
		frmEjemploRemoto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_principal = new JPanel();
		frmEjemploRemoto.getContentPane().add(panel_principal, BorderLayout.CENTER);
		panel_principal.setLayout(new BorderLayout(0, 0));
	}

}
