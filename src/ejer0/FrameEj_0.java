package ejer0;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class FrameEj_0 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameEj_0 frame = new FrameEj_0();
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
	public FrameEj_0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(22, 233, 85));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf_first = new JTextField();
		tf_first.setHorizontalAlignment(SwingConstants.CENTER);
		tf_first.setText("Hey");
		tf_first.setBounds(142, 28, 154, 20);
		contentPane.add(tf_first);
		tf_first.setColumns(10);
		
		JButton btnChange = new JButton("CHANGE");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				String initialText = tf_first.getText();
				changeText(click, initialText);
			}
		});
		btnChange.setBounds(175, 161, 89, 23);
		contentPane.add(btnChange);

	}
	
	private void changeText(ActionEvent event, String text) {
		if (text.equals("Hey")) {
			tf_first.setText("Hola Mundo!");
		}
		else {tf_first.setText("Hey");}
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}  
}
