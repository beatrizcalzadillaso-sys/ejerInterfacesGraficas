package ejer3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Frame3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_LastName1;
	private JTextField tf_LastName2;
	private JTextField tf_Age;
	private JTextField tf_ID;

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
		contentPane.setBackground(new Color(255, 187, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAnnounce = new JLabel("Registro");
		lblAnnounce.setFont(new Font("Verdana", Font.BOLD, 13));
		lblAnnounce.setBounds(176, 11, 68, 17);
		contentPane.add(lblAnnounce);
		
		JLabel lblName = new JLabel("Nombre:");
		lblName.setBounds(39, 43, 57, 14);
		contentPane.add(lblName);
		
		JLabel lblLastName1 = new JLabel("Apellido1:");
		lblLastName1.setBounds(39, 83, 57, 14);
		contentPane.add(lblLastName1);
		
		JLabel lblLastName2 = new JLabel("Apellido2:");
		lblLastName2.setBounds(39, 124, 57, 14);
		contentPane.add(lblLastName2);
		
		JLabel lblAge = new JLabel("Edad:");
		lblAge.setBounds(39, 206, 46, 14);
		contentPane.add(lblAge);
		
		JTextField tf_Name = new JTextField();
		tf_Name.setBounds(186, 39, 118, 20);
		contentPane.add(tf_Name);
		tf_Name.setColumns(10);
		
		tf_LastName1 = new JTextField();
		tf_LastName1.setColumns(10);
		tf_LastName1.setBounds(186, 80, 118, 20);
		contentPane.add(tf_LastName1);
		
		tf_LastName2 = new JTextField();
		tf_LastName2.setColumns(10);
		tf_LastName2.setBounds(186, 121, 118, 20);
		contentPane.add(tf_LastName2);
		
		tf_Age = new JTextField();
		tf_Age.setColumns(10);
		tf_Age.setBounds(186, 203, 118, 20);
		contentPane.add(tf_Age);
		
		JLabel lbl_ID = new JLabel("Identificacion:");
		lbl_ID.setBounds(28, 169, 89, 14);
		contentPane.add(lbl_ID);
		
		JComboBox cb_SelectID = new JComboBox();
		cb_SelectID.setModel(new DefaultComboBoxModel(new String[] {"DNI", "NIE"}));
		cb_SelectID.setBounds(115, 165, 46, 22);
		contentPane.add(cb_SelectID);
		
		tf_ID = new JTextField();
		tf_ID.setColumns(10);
		tf_ID.setBounds(186, 166, 118, 20);
		contentPane.add(tf_ID);

	}
}
