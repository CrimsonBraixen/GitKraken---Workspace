package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameAux extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JFrame padre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAux frame = new FrameAux(new Frame2());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameAux(Frame2 padre) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.padre = padre;
		setLocationRelativeTo(padre);
		
		textField = new JTextField();
		textField.setBounds(167, 84, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actualizarPrincipal();
			}
		});
		btnAceptar.setBounds(164, 197, 89, 23);
		contentPane.add(btnAceptar);
		
	}
	
	public void actualizarPrincipal(){
		((Frame2) padre).escribirEtiqueta(textField.getText());
		dispose();
	}
}
