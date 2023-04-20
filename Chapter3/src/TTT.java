import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class TTT {

	private JFrame frame;
	private JTextField txtHey;
	
	
	int Counter = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TTT window = new TTT();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TTT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(126, 211, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton Square1 = new JButton("");
		Square1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				if (Counter % 2 == 0) {
				Square1.setText("X"); }
				else {
				Square1.setText("O");
				}
				
				
			}
		});
		Square1.setBounds(10, 11, 131, 72);
		panel.add(Square1);
		
		JButton Square2 = new JButton("");
		Square2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				if (Counter % 2 == 0) {
				Square2.setText("X"); }
				else {
				Square2.setText("O");
				}
			}
		});
		Square2.setBounds(273, 11, 131, 72);
		panel.add(Square2);
		
		JButton Square3 = new JButton("");
		Square3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square3.setText("I think it works");
			}
		});
		Square3.setBounds(142, 11, 131, 72);
		panel.add(Square3);
		
		JButton Square7 = new JButton("");
		Square7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square7.setText("Cookieman");
			}
		});
		Square7.setBounds(10, 156, 131, 72);
		panel.add(Square7);
		
		JButton Square8 = new JButton("");
		Square8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square8.setText("Santa");
			}
		});
		Square8.setBounds(142, 156, 131, 72);
		panel.add(Square8);
		
		JButton Square9 = new JButton("");
		Square9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square9.setText("Muffin");
			}
		});
		Square9.setBounds(273, 156, 131, 72);
		panel.add(Square9);
		
		JButton Square4 = new JButton("");
		Square4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square4.setText("OMG");
			}
		});
		Square4.setBounds(10, 83, 131, 72);
		panel.add(Square4);
		
		JButton Square5 = new JButton("");
		Square5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square5.setText("YES");
			}
		});
		Square5.setBounds(142, 83, 131, 72);
		panel.add(Square5);
		
		JButton Square6 = new JButton("");
		Square6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square6.setText("Pizza");
			}
		});
		Square6.setBounds(273, 83, 131, 72);
		panel.add(Square6);
		
		txtHey = new JTextField();
		txtHey.setHorizontalAlignment(SwingConstants.CENTER);
		txtHey.setBackground(new Color(255, 255, 255));
		txtHey.setFont(new Font("Brush Script MT", Font.PLAIN, 90));
		txtHey.setText("Tic Tac Toe!");
		txtHey.setBounds(126, 11, 414, 189);
		frame.getContentPane().add(txtHey);
		txtHey.setColumns(10);
	}
}
