import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EndGamePopup extends JFrame {

	JButton MainMenuExit = new JButton("Main Menu");
	JButton PlayAgain = new JButton("Play Again");

	private JFrame frame;
	private JPanel contentPane;

	TTT TicTac = new TTT();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndGamePopup frame = new EndGamePopup();
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
	public EndGamePopup() {
		TTT TicTac = new TTT();
		TicTac.frame.setLocation(500, 100);
		TicTac.frame.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 11, 75, 339);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(299, 11, 75, 339);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(95, 11, 194, 60);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Settings");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 40));
		panel_2.add(lblNewLabel);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(95, 82, 10, 268);
		contentPane.add(panel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(Color.BLACK);
		panel_2_1_1.setBounds(279, 82, 10, 268);
		contentPane.add(panel_2_1_1);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBackground(Color.BLACK);
		panel_2_1_2.setBounds(95, 82, 194, 10);
		contentPane.add(panel_2_1_2);
		
		JPanel panel_2_1_2_1 = new JPanel();
		panel_2_1_2_1.setBackground(Color.BLACK);
		panel_2_1_2_1.setBounds(95, 340, 194, 10);
		contentPane.add(panel_2_1_2_1);

		PlayAgain.setForeground(Color.WHITE);
		
		PlayAgain.setOpaque(true);
		PlayAgain.setFont(new Font("Impact", Font.PLAIN, 20));
		PlayAgain.setBackground(Color.DARK_GRAY);
		PlayAgain.setBounds(115, 103, 154, 100);
		contentPane.add(PlayAgain);
		MainMenuExit.setForeground(Color.WHITE);
		
		MainMenuExit.setOpaque(true);
		MainMenuExit.setFont(new Font("Impact", Font.PLAIN, 20));
		MainMenuExit.setBackground(Color.DARK_GRAY);
		MainMenuExit.setBounds(115, 229, 154, 100);
		contentPane.add(MainMenuExit);
		
		JPanel panel_2_1_2_2 = new JPanel();
		panel_2_1_2_2.setBackground(Color.BLACK);
		panel_2_1_2_2.setBounds(95, 208, 194, 10);
		contentPane.add(panel_2_1_2_2);

		PlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TicTac.frame.dispose();
				TTT TicTac = new TTT();
				TicTac.frame.setLocation(500, 100);
				TicTac.frame.setVisible(true);

			}
		});
		
	}

}

	
