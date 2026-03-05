package ejer2;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Frame02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_Selection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame02 frame = new Frame02();
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
	public Frame02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(124, 250, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonGroup gameGroup = new ButtonGroup();
		
		JLabel lblAsk = new JLabel("Seleccione el mejor video-juego");
		lblAsk.setFont(new Font("Verdana", Font.BOLD, 14));
		lblAsk.setBounds(78, 11, 255, 37);
		contentPane.add(lblAsk);
		
		JRadioButton rdbtnFallout = new JRadioButton("Fallout");
		rdbtnFallout.setBackground(new Color(200, 253, 233));
		rdbtnFallout.setBounds(33, 55, 109, 23);
		contentPane.add(rdbtnFallout);
		rdbtnFallout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eCheck) {
				tf_Selection.setText("Fallout");				
			}
		});
		
		//boolean selected1 = rdbtnFallout.isSelected();
		
		JRadioButton rdbtnNFP = new JRadioButton("Need for Speed");
		rdbtnNFP.setBackground(new Color(200, 253, 233));
		rdbtnNFP.setBounds(33, 107, 109, 23);
		contentPane.add(rdbtnNFP);
		rdbtnNFP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eCheck) {
				tf_Selection.setText("Need for Speed");				
			}
		});
		
		JRadioButton rdbtnMario = new JRadioButton("Mario Kart");
		rdbtnMario.setBackground(new Color(200, 253, 233));
		rdbtnMario.setBounds(209, 55, 109, 23);
		contentPane.add(rdbtnMario);
		rdbtnMario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eCheck) {
				tf_Selection.setText("Mario Kart");				
			}
		});
		
		JRadioButton rdbtnStarCraft = new JRadioButton("StarCraft");
		rdbtnStarCraft.setBackground(new Color(200, 253, 233));
		rdbtnStarCraft.setBounds(209, 107, 109, 23);
		contentPane.add(rdbtnStarCraft);
		rdbtnStarCraft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eCheck) {
				tf_Selection.setText("StarCraft");				
			}
		});
		
		gameGroup.add(rdbtnFallout);
		gameGroup.add(rdbtnNFP);
		gameGroup.add(rdbtnMario);
		gameGroup.add(rdbtnStarCraft);
		
		JLabel lblSelected = new JLabel("Ha seleccionado: ");
		lblSelected.setFont(new Font("Verdana", Font.BOLD, 13));
		lblSelected.setBounds(33, 184, 128, 14);
		contentPane.add(lblSelected);
		
		tf_Selection = new JTextField();
		tf_Selection.setBounds(171, 182, 147, 23);
		contentPane.add(tf_Selection);
		tf_Selection.setColumns(10);
		
		
		
	}
	
	
	
}
