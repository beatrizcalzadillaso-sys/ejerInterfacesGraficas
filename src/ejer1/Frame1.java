package ejer1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
		setBounds(100, 100, 406, 274);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(9, 242, 155));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(new Color(124, 250, 203));
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 143, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 200, SpringLayout.WEST, contentPane);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblUser = new JLabel("user:");
		panel.add(lblUser);
		
		JLabel lblPassword = new JLabel("password:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblPassword, 52, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblUser, 0, SpringLayout.WEST, lblPassword);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblUser, -18, SpringLayout.NORTH, lblPassword);
		sl_panel.putConstraint(SpringLayout.WEST, lblPassword, 10, SpringLayout.WEST, panel);
		lblPassword.setEnabled(false);
		panel.add(lblPassword);
		
		tf_password = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, tf_password, -3, SpringLayout.NORTH, lblPassword);
		sl_panel.putConstraint(SpringLayout.WEST, tf_password, 2, SpringLayout.EAST, lblPassword);
		panel.add(tf_password);
		tf_password.setColumns(10);
		
		tf_user = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, tf_user, -3, SpringLayout.NORTH, lblUser);
		sl_panel.putConstraint(SpringLayout.WEST, tf_user, 0, SpringLayout.WEST, tf_password);
		panel.add(tf_user);
		tf_user.setColumns(10);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eCheck) {
				String typedUser= tf_user.getText();
				String typedPass= tf_password.getText();
				checkCredentials(eCheck, typedUser, typedPass);
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCheck, 27, SpringLayout.SOUTH, panel);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCheck, 0, SpringLayout.EAST, panel);
		contentPane.add(btnCheck);

	}
	
	private void checkCredentials(ActionEvent event, String name, String keyWord) {
		if (name.equals("admin") && keyWord.equals("admin")) {
			JOptionPane.showMessageDialog(null, "Bienvenido");
		}
		else {JOptionPane.showMessageDialog(null, "User o password desconocido"); }
	}
}
