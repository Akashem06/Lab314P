import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class TTT {

	private JFrame frame;
	private JTextField txtHey;
	
	
	int Counter = 1;
	
	JButton Square1 = new JButton("");
	JButton Square3 = new JButton("");
	JButton Square2 = new JButton("");
	JButton Square7 = new JButton("");
	JButton Square8 = new JButton("");
	JButton Square9 = new JButton("");
	JButton Square4 = new JButton("");
	JButton Square5 = new JButton("");
	JButton Square6 = new JButton("");
	
	boolean PlayAgain = true;
	
	
	private JTextField txtXTurn;

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
		panel.setBounds(136, 211, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Square1.setBackground(new Color(255, 255, 255));
		Square1.setFont(new Font("Segoe Print", Font.PLAIN, 60));
		Square1.setBounds(10, 11, 131, 72);
		panel.add(Square1);
		
		Square3.setBackground(new Color(255, 255, 255));
		Square3.setFont(new Font("Segoe Print", Font.PLAIN, 60));
		Square3.setBounds(273, 11, 131, 72);
		panel.add(Square3);
		
		Square2.setBackground(new Color(255, 255, 255));
		Square2.setFont(new Font("Segoe Print", Font.PLAIN, 60));
		Square2.setBounds(142, 11, 131, 72);
		panel.add(Square2);
		
		Square7.setBackground(new Color(255, 255, 255));
		Square7.setFont(new Font("Segoe Print", Font.PLAIN, 60));
		Square7.setBounds(10, 156, 131, 72);
		panel.add(Square7);
		
		Square8.setBackground(new Color(255, 255, 255));
		Square8.setFont(new Font("Segoe Print", Font.PLAIN, 60));
		Square8.setBounds(142, 156, 131, 72);
		panel.add(Square8);
		
		Square9.setBackground(new Color(255, 255, 255));
		Square9.setFont(new Font("Segoe Print", Font.PLAIN, 60));
		Square9.setBounds(273, 156, 131, 72);
		panel.add(Square9);
		
		Square4.setBackground(new Color(255, 255, 255));
		Square4.setFont(new Font("Segoe Print", Font.PLAIN, 60));
		Square4.setBounds(10, 83, 131, 72);
		panel.add(Square4);
		
		Square5.setBackground(new Color(255, 255, 255));
		Square5.setFont(new Font("Segoe Print", Font.PLAIN, 60));
		Square5.setBounds(142, 83, 131, 72);
		panel.add(Square5);
		
		Square6.setBackground(new Color(255, 255, 255));
		Square6.setFont(new Font("Segoe Print", Font.PLAIN, 60));
		Square6.setBounds(273, 83, 131, 72);
		panel.add(Square6);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(46, 139, 87));
		panel_1_2.setBounds(-14, -200, 428, 439);
		panel.add(panel_1_2);
		
		txtHey = new JTextField();
		txtHey.setForeground(new Color(0, 0, 0));
		txtHey.setEditable(false);
		txtHey.setHorizontalAlignment(SwingConstants.CENTER);
		txtHey.setBackground(new Color(46, 139, 87));
		txtHey.setFont(new Font("Impact", Font.PLAIN, 70));
		txtHey.setText("Tic Tac Toe!");
		txtHey.setBounds(148, 26, 392, 109);
		frame.getContentPane().add(txtHey);
		txtHey.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds(10, 11, 106, 439);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(47, 79, 79));
		panel_1_1.setBounds(568, 11, 106, 439);
		frame.getContentPane().add(panel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(46, 139, 87));
		panel_2.setBounds(126, 0, 12, 200);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(46, 139, 87));
		panel_2_1.setBounds(548, 0, 10, 200);
		frame.getContentPane().add(panel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(46, 139, 87));
		panel_2_2.setBounds(126, 197, 432, 10);
		frame.getContentPane().add(panel_2_2);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBackground(new Color(46, 139, 87));
		panel_2_2_1.setBounds(126, 0, 432, 10);
		frame.getContentPane().add(panel_2_2_1);
		
		txtXTurn = new JTextField();
		txtXTurn.setForeground(new Color(0, 0, 0));
		txtXTurn.setBackground(new Color(46, 139, 87));
		txtXTurn.setText("X Turn");
		txtXTurn.setHorizontalAlignment(SwingConstants.CENTER);
		txtXTurn.setFont(new Font("Segoe UI Black", Font.PLAIN, 50));
		txtXTurn.setBounds(146, 146, 392, 43);
		frame.getContentPane().add(txtXTurn);
		txtXTurn.setColumns(10);
		
		Square1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square1.setEnabled(false);
				if (Counter % 2 == 0) {
					Square1.setText("X"); 
				if (Counter < 10) {
				txtXTurn.setText("O Turn"); }
				else {
					txtXTurn.setText("Tie");
				}
				Check();
		}
				else {
					Square1.setText("O");
					Check();
				if (Counter < 10) {
				txtXTurn.setText("X Turn");}
				else {
					txtXTurn.setText("Tie");
				}
				Check();
			}
				
			}});

		Square2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square2.setEnabled(false);
				if (Counter % 2 == 0) {
					Square2.setText("X");
					if (Counter < 10) {
						txtXTurn.setText("O Turn"); }
						else {
							txtXTurn.setText("Tie");} 
					Check();
					}

					else {
						Square2.setText("O");
					if (Counter < 10) {
						txtXTurn.setText("X Turn");}
					else {
						txtXTurn.setText("Tie"); }
						Check();
					}
			
		}});
		
		Square3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square3.setEnabled(false);
				if (Counter % 2 == 0) {
					Square3.setText("X");
				if (Counter < 10) {
					txtXTurn.setText("O Turn"); }
					else {
						txtXTurn.setText("Tie"); }
				Check();
				}
				
				else {
					Square3.setText("O");
				if (Counter < 10) {
					txtXTurn.setText("X Turn");}
					else {
						txtXTurn.setText("Tie");
						}
				Check();
			}
		}});
		
		Square4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square4.setEnabled(false);
				if (Counter % 2 == 0) {
					Square4.setText("X");
					if (Counter < 10) {
						txtXTurn.setText("O Turn"); }
						else {
							txtXTurn.setText("Tie"); }
					Check();
					}
					else {
						Square4.setText("O");
					if (Counter < 10) {
						txtXTurn.setText("X Turn");}
						else {
							txtXTurn.setText("Tie"); 
							 }
					Check();
					} 	
			
		}});
		
		Square5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square5.setEnabled(false);
				if (Counter % 2 == 0) {
					Square5.setText("X");
					if (Counter < 10) {
						txtXTurn.setText("O Turn"); }
						else {
							txtXTurn.setText("Tie");} 
					Check();
					}
					else {
						Square5.setText("O");
					if (Counter < 10) {
						txtXTurn.setText("X Turn");}
						else {
							txtXTurn.setText("Tie"); 
							}
					Check();
					} 
			
		}});
		
		Square6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square6.setEnabled(false);
				if (Counter % 2 == 0) {
					Square6.setText("X"); 
					if (Counter < 10) {
						txtXTurn.setText("O Turn"); }
						else {
							txtXTurn.setText("Tie");} 
					Check();
					}
					else {
						Square6.setText("O");
					if (Counter < 10) {
						txtXTurn.setText("X Turn");}
						else {
							txtXTurn.setText("Tie"); 
							}
					Check();
		}
			
		}});
		
		Square7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square7.setEnabled(false);
				if (Counter % 2 == 0) {
					Square7.setText("X");
					if (Counter < 10) {
						txtXTurn.setText("O Turn"); }
						else {
							txtXTurn.setText("Tie");}
					Check();
					}
					else {
						Square7.setText("O");
					if (Counter < 10) {
						txtXTurn.setText("X Turn");}
						else {
							txtXTurn.setText("Tie"); 
							}
					Check();
					}
		}});
		
		Square8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square8.setEnabled(false);
				if (Counter % 2 == 0) {
					Square8.setText("X");
					if (Counter < 10) {
						txtXTurn.setText("O Turn"); }
						else {
							txtXTurn.setText("Tie");} 
					Check();
					}
					else {
						Square8.setText("O");
					if (Counter < 10) {
						txtXTurn.setText("X Turn");}
						else {
							txtXTurn.setText("Tie");
							}
					Check();
					} 
			
		}});
		
		Square9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Counter += 1;
				Square9.setEnabled(false);
				if (Counter % 2 == 0) {
					Square9.setText("X");
					if (Counter < 10) {
						txtXTurn.setText("O Turn"); }
						else {
							txtXTurn.setText("Tie");}
					Check();
					}
					else {
						Square9.setText("O");
					if (Counter < 10) {
						txtXTurn.setText("X Turn");}
						else {
							txtXTurn.setText("Tie"); 
						}
					Check();
		} 
			
		}});
		
	}

	public void Check() {
		if( 
				(Square1.getText() == "X") &&
				(Square2.getText() == "X") && 
				(Square3.getText() == "X")) {
		Square1.setBackground(new Color(0, 255, 0));
		Square2.setBackground(new Color(0, 255, 0));
		Square3.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("X win's!");
		DisableButtons();
			}
		if( 
				(Square1.getText() == "X") &&
				(Square5.getText() == "X") && 
				(Square9.getText() == "X")) {
		Square1.setBackground(new Color(0, 255, 0));
		Square5.setBackground(new Color(0, 255, 0));
		Square9.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("X win's!");
		DisableButtons();
			}
		if( 
				(Square1.getText() == "X") &&
				(Square4.getText() == "X") && 
				(Square7.getText() == "X")) {
		Square1.setBackground(new Color(0, 255, 0));
		Square4.setBackground(new Color(0, 255, 0));
		Square7.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("X win's!");
		DisableButtons();
			}
		if( 
				(Square2.getText() == "X") &&
				(Square5.getText() == "X") && 
				(Square8.getText() == "X")) {
		Square2.setBackground(new Color(0, 255, 0));
		Square5.setBackground(new Color(0, 255, 0));
		Square8.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("X win's!");
		DisableButtons();
			}
		if( 
				(Square3.getText() == "X") &&
				(Square5.getText() == "X") && 
				(Square7.getText() == "X")) {
		Square3.setBackground(new Color(0, 255, 0));
		Square5.setBackground(new Color(0, 255, 0));
		Square7.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("X win's!");
		DisableButtons();
			}
		if( 
				(Square3.getText() == "X") &&
				(Square6.getText() == "X") && 
				(Square9.getText() == "X")) {
		Square3.setBackground(new Color(0, 255, 0));
		Square6.setBackground(new Color(0, 255, 0));
		Square9.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("X win's!"); 
		DisableButtons();
			}
		if( 
				(Square4.getText() == "X") &&
				(Square5.getText() == "X") && 
				(Square6.getText() == "X")) {
		Square4.setBackground(new Color(0, 255, 0));
		Square5.setBackground(new Color(0, 255, 0));
		Square6.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("X win's!");
		DisableButtons();
			}
		if( 
				(Square7.getText() == "X") &&
				(Square8.getText() == "X") && 
				(Square9.getText() == "X")) {
		Square7.setBackground(new Color(0, 255, 0));
		Square8.setBackground(new Color(0, 255, 0));
		Square9.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("X win's!");
		DisableButtons();
			}
		if( 
				(Square1.getText() == "O") &&
				(Square2.getText() == "O") && 
				(Square3.getText() == "O")) {
		Square1.setBackground(new Color(0, 255, 0));
		Square2.setBackground(new Color(0, 255, 0));
		Square3.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("O win's!");
		DisableButtons();
			}
		if( 
				(Square1.getText() == "O") &&
				(Square5.getText() == "O") && 
				(Square9.getText() == "O")) {
		Square1.setBackground(new Color(0, 255, 0));
		Square5.setBackground(new Color(0, 255, 0));
		Square9.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("O win's!");
		DisableButtons();
			}
		if( 
				(Square1.getText() == "O") &&
				(Square4.getText() == "O") && 
				(Square7.getText() == "O")) {
		Square1.setBackground(new Color(0, 255, 0));
		Square4.setBackground(new Color(0, 255, 0));
		Square7.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("O win's!");
		DisableButtons();
			}
		if( 
				(Square2.getText() == "O") &&
				(Square5.getText() == "O") && 
				(Square8.getText() == "O")) {
		Square2.setBackground(new Color(0, 255, 0));
		Square5.setBackground(new Color(0, 255, 0));
		Square8.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("O win's!");
		DisableButtons();
			}
		if( 
				(Square3.getText() == "O") &&
				(Square5.getText() == "O") && 
				(Square7.getText() == "O")) {
		Square3.setBackground(new Color(0, 255, 0));
		Square5.setBackground(new Color(0, 255, 0));
		Square7.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("O win's!");
		DisableButtons();
			}
		if( 
				(Square3.getText() == "O") &&
				(Square6.getText() == "O") && 
				(Square9.getText() == "O")) {
		Square3.setBackground(new Color(0, 255, 0));
		Square6.setBackground(new Color(0, 255, 0));
		Square9.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("O win's!");
		DisableButtons();
			}
		if( 
				(Square4.getText() == "O") &&
				(Square5.getText() == "O") && 
				(Square6.getText() == "O")) {
		Square4.setBackground(new Color(0, 255, 0));
		Square5.setBackground(new Color(0, 255, 0));
		Square6.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("O win's!");
		DisableButtons();
			}
		if( 
				(Square7.getText() == "O") &&
				(Square8.getText() == "O") && 
				(Square9.getText() == "O")) {
		Square7.setBackground(new Color(0, 255, 0));
		Square8.setBackground(new Color(0, 255, 0));
		Square9.setBackground(new Color(0, 255, 0));
		Counter = 10;
		txtXTurn.setText("O win's!");
		DisableButtons();
			}
	}
	public void DisableButtons() {
		Square1.setEnabled(false);
		Square2.setEnabled(false);
		Square3.setEnabled(false);
		Square4.setEnabled(false);
		Square5.setEnabled(false);
		Square6.setEnabled(false);
		Square7.setEnabled(false);
		Square8.setEnabled(false);
		Square9.setEnabled(false);
	}
}

