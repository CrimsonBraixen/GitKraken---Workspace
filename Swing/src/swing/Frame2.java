package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel;
	long contador = 0;
	private JButton btnAbrir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
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
	public Frame2() {
		setTitle("Ventana Con Evento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel = new JLabel();
		lblNewLabel.setBounds(163, 93, 104, 48);
		contentPane.add(lblNewLabel);

		JButton btnContarclicks = new JButton("ContarClicks");
		btnContarclicks.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				contador++;
				lblNewLabel.setText(String.valueOf(contador));
			}
		});
		btnContarclicks.setBounds(152, 127, 129, 23);
		contentPane.add(btnContarclicks);

		btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirSecundaria();
			}
		});
		btnAbrir.setBounds(163, 202, 89, 23);
		contentPane.add(btnAbrir);
	}

	private void abrirSecundaria() {
		JFrame frameAux = new FrameAux(this);
		frameAux.setVisible(true);
	}

	public void escribirEtiqueta(String texto) {
		lblNewLabel.setText(texto);
	}
}
