import java.awt.EventQueue;

import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;


public class MemoryGame {

	private JFrame frame;
	private JTextField txtTitle;
	
	//Write Global Variables here
	
	boolean PlayAgain = true;
	
	Timer ButtonTimer = new Timer();
	
	TimerTask Lightup1 = new TimerTask() {
		public void run() {
			Button1.setBackground(new Color(0, 50, 100));
		}
	};
	
	TimerTask Lightup2 = new TimerTask() {
		public void run() {
			Button2.setBackground(new Color(120, 100, 0));
		}
	};
	
	TimerTask Lightup3 = new TimerTask() {
		public void run() {
			Button3.setBackground(new Color(0, 90, 40));
		}
	};
	
	TimerTask Lightup4 = new TimerTask() {
		public void run() {
			Button4.setBackground(new Color(100, 0, 100));
		}
	};
	
	
	ArrayList<Integer> ClickSequence = new ArrayList<Integer>();
	
	ArrayList<Integer> ColorSequence = new ArrayList<Integer>();
	
	int Color = 0;
	
	
	JButton Button1 = new JButton("");
	JButton Button2 = new JButton("");
	JButton Button3 = new JButton("");
	JButton Button4 = new JButton("");

	private JTextField txtXTurn;
	private final JPanel panel = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel_3 = new JPanel();
	private final JPanel panel_4 = new JPanel();

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemoryGame window = new MemoryGame();
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
	public MemoryGame() {
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 0));
		panel_1.setBounds(10, 11, 106, 439);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(128, 0, 0));
		panel_1_1.setBounds(568, 11, 106, 439);
		frame.getContentPane().add(panel_1_1);
		
		txtTitle = new JTextField();
		txtTitle.setForeground(new Color(0, 0, 0));
		txtTitle.setEditable(false);
		txtTitle.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitle.setBackground(new Color(205, 92, 92));
		txtTitle.setFont(new Font("Impact", Font.PLAIN, 60));
		txtTitle.setText("Memory Game!");
		txtTitle.setBounds(148, 26, 392, 109);
		frame.getContentPane().add(txtTitle);
		txtTitle.setColumns(10);
		
		Button1.setOpaque(true);
		Button1.setForeground(new Color(255, 250, 250));
		Button1.setBackground(new Color(0, 50, 100));
		Button1.setBounds(294, 175, 100, 100);
		frame.getContentPane().add(Button1);
		
		Button2.setOpaque(true);
		Button2.setForeground(new Color(255, 250, 250));
		Button2.setBackground(new Color(120, 100, 0));
		Button2.setBounds(415, 249, 100, 100);
		frame.getContentPane().add(Button2);
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Button3.setOpaque(true);
		Button3.setForeground(new Color(255, 250, 250));
		Button3.setBackground(new Color(0, 90, 40));
		Button3.setBounds(294, 321, 100, 100);
		frame.getContentPane().add(Button3);
		
		
		Button4.setOpaque(true);
		Button4.setForeground(new Color(255, 250, 250));
		Button4.setBackground(new Color(100, 0, 100));
		Button4.setBounds(173, 249, 100, 100);
		frame.getContentPane().add(Button4);
		panel.setBackground(new Color(205, 92, 92));
		panel.setBounds(148, 146, 392, 18);
		
		frame.getContentPane().add(panel);
		panel_2.setBackground(new Color(205, 92, 92));
		panel_2.setBounds(148, 432, 392, 18);
		
		frame.getContentPane().add(panel_2);
		panel_3.setBackground(new Color(205, 92, 92));
		panel_3.setBounds(148, 146, 15, 304);
		
		frame.getContentPane().add(panel_3);
		panel_4.setBackground(new Color(205, 92, 92));
		panel_4.setBounds(525, 146, 15, 304);
		
		frame.getContentPane().add(panel_4);
		
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button1.setEnabled(false);
				ClickSequence.add(1);
				Button1.setBackground(new Color(30, 150, 255));
				ButtonTimer.schedule(Lightup1, 750);

				
			}
		});
		
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button2.setEnabled(false);
				ClickSequence.add(2);
				Button2.setBackground(new Color(255, 210, 0));
				ButtonTimer.schedule(Lightup2, 750);
			}
		});
		
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button3.setEnabled(false);
				ClickSequence.add(3);
				Button3.setBackground(new Color(60, 180, 110));
				ButtonTimer.schedule(Lightup3, 750);
			}
		});
		
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button4.setEnabled(false);
				ClickSequence.add(4);
				Button4.setBackground(new Color(255, 0, 255));
				ButtonTimer.schedule(Lightup4, 750);
			}
		});
		
} 
	public void Check() {
		if (ClickSequence == ColorSequence) {
		PlayAgain = true; }
		else {
			PlayAgain = false;}
	}
	
	public void SequenceCreator() {
		while (PlayAgain) {
			Color = (int)((Math.random() * 4) + 1); }
			ColorSequence.add(Color);
	}
	
	public void LightUpSquare() {
		
		if (Color == 1) {
			
		}
		if (Color == 2) {
			
		}
		if (Color == 3) {
			
		}
		if (Color == 4) {
			
		}
		
	}
}