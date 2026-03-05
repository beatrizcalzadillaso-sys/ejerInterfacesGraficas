package ejer1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_user;
	private JTextField tf_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(9, 242, 155));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("user:");
		lblUser.setBounds(10, 38, 46, 14);
		contentPane.add(lblUser);
		
		JLabel lblPassword = new JLabel("password:");
		lblPassword.setBounds(10, 84, 57, 14);
		contentPane.add(lblPassword);
		
		tf_user = new JTextField();
		tf_user.setBounds(84, 35, 86, 20);
		contentPane.add(tf_user);
		tf_user.setColumns(10);
		
		tf_password = new JTextField();
		tf_password.setBounds(84, 81, 86, 20);
		contentPane.add(tf_password);
		tf_password.setColumns(10);

	}
}
