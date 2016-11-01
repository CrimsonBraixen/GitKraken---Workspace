package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class FrameChat extends JFrame {
	private JTextField textField;
	JScrollPane scrollPane;
	JTextArea textArea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameChat frame = new FrameChat();
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
	public FrameChat() {
		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
//		panel.setLayout(null);
		panel.setLayout(new BorderLayout());
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(67, 11, 234, 167);
		panel.add(scrollPane);
		panel.add(panel2, BorderLayout.NORTH);
		panel2.setLayout(null);
		//panel.add(panel2.setLayout(null), BorderLayout.NORTH);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escribir();
			}
		});
		
		
		btnNewButton.setBounds(335, 214, 89, 23);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(28, 208, 278, 34);
		panel.add(textField);
		textField.setColumns(10);
		/*
		textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER){
					escribir();
				}
			}
		});*/
	}

	private void escribir() {
		textArea.append(textField.getText()+"\n");
		textField.setText("");
	}
}
