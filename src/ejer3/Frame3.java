package ejer3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Frame3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 frame = new Frame3();
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
	public Frame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAnnounce = new JLabel("Registro");
		lblAnnounce.setFont(new Font("Verdana", Font.BOLD, 13));
		lblAnnounce.setBounds(176, 11, 68, 17);
		contentPane.add(lblAnnounce);
		
		JLabel lblName = new JLabel("Nombre:");
		lblName.setBounds(39, 43, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblLastName1 = new JLabel("Apellido1:");
		lblLastName1.setBounds(39, 68, 46, 14);
		contentPane.add(lblLastName1);
		
		JLabel lblLastName2 = new JLabel("Apellido2:");
		lblLastName2.setBounds(39, 95, 46, 14);
		contentPane.add(lblLastName2);
		
		JLabel lblAge = new JLabel("Edad:");
		lblAge.setBounds(39, 149, 46, 14);
		contentPane.add(lblAge);

	}

}
