import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TicTacToe extends JFrame {
	
	private int moveCount = 0;
	private boolean turnForX = true;
	
	private boolean buttonFlagO1 = false, buttonFlagX1 = false, markedFlag1 = false;
	private boolean buttonFlagO2 = false, buttonFlagX2 = false, markedFlag2 = false;
	private boolean buttonFlagO3 = false, buttonFlagX3 = false, markedFlag3 = false;
	private boolean buttonFlagO4 = false, buttonFlagX4 = false, markedFlag4 = false;
	private boolean buttonFlagO5 = false, buttonFlagX5 = false, markedFlag5 = false;
	private boolean buttonFlagO6 = false, buttonFlagX6 = false, markedFlag6 = false;
	private boolean buttonFlagO7 = false, buttonFlagX7 = false, markedFlag7 = false;
	private boolean buttonFlagO8 = false, buttonFlagX8 = false, markedFlag8 = false;
	private boolean buttonFlagO9 = false, buttonFlagX9 = false, markedFlag9 = false;
    
    Image imageX;
    Image imageO;
    
	private JPanel contentPane;
	private JLabel gameStateLabel;
	private JButton markButton1;
	private JButton markButton2;
	private JButton markButton3;
	private JButton markButton4;
	private JButton markButton5;
	private JButton markButton6;
	private JButton markButton7;
	private JButton markButton8;
	private JButton markButton9;
	private JButton newGameButton;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TicTacToe() {
		initComponents();
	}
	
	public void initComponents() {
		
		try {
			imageX = ImageIO.read(getClass().getResource("images/X.png")).getScaledInstance(120,120,Image.SCALE_DEFAULT);
			imageO = ImageIO.read(getClass().getResource("images/O.png")).getScaledInstance(120,120,Image.SCALE_DEFAULT);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
		setTitle("TicTacToe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 405, 470);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		markButton1 = new JButton("");
		markButton1.setBounds(10, 11, 120, 120);
		markButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turnForX == true && markedFlag1 == false) {
					markButton1.setIcon(new ImageIcon(imageX));
					turnForX = false;
					buttonFlagX1 = true;
					moveCount++;
				}
				else if(turnForX == false && markedFlag1 == false){
					markButton1.setIcon(new ImageIcon(imageO));
					turnForX = true;
					buttonFlagO1 = true;
					moveCount++;
				}
				markedFlag1 = true;
				checkGameState();
			}
		});
		contentPane.add(markButton1);
		
		markButton2 = new JButton("");
		markButton2.setBounds(140, 11, 120, 120);
		markButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turnForX == true && markedFlag2 == false) {
					markButton2.setIcon(new ImageIcon(imageX));
					turnForX = false;
					buttonFlagX2 = true;
					moveCount++;
				}
				else if(turnForX == false && markedFlag2 == false){
					markButton2.setIcon(new ImageIcon(imageO));
					turnForX = true;
					buttonFlagO2 = true;
					moveCount++;
				}
				markedFlag2 = true;
				checkGameState();
			}
		});
		contentPane.add(markButton2);
		
		markButton3 = new JButton("");
		markButton3.setBounds(270, 11, 120, 120);
		markButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turnForX == true && markedFlag3 == false) {
					markButton3.setIcon(new ImageIcon(imageX));
					turnForX = false;
					buttonFlagX3 = true;
					moveCount++;
				}
				else if(turnForX == false && markedFlag3 == false){
					markButton3.setIcon(new ImageIcon(imageO));
					turnForX = true;
					buttonFlagO3 = true;
					moveCount++;
				}
				markedFlag3 = true;
				checkGameState();
			}
		});
		contentPane.add(markButton3);
		
		markButton4 = new JButton("");
		markButton4.setBounds(10, 142, 120, 120);
		markButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turnForX == true && markedFlag4 == false) {
					markButton4.setIcon(new ImageIcon(imageX));
					turnForX = false;
					buttonFlagX4 = true;
					moveCount++;
				}
				else if(turnForX == false && markedFlag4 == false){
					markButton4.setIcon(new ImageIcon(imageO));
					turnForX = true;
					buttonFlagO4 = true;
					moveCount++;
				}
				markedFlag4 = true;
				checkGameState();
			}
		});
		contentPane.add(markButton4);
		
		markButton5 = new JButton("");
		markButton5.setBounds(140, 142, 120, 120);
		markButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turnForX == true && markedFlag5 == false) {
					markButton5.setIcon(new ImageIcon(imageX));
					turnForX = false;
					buttonFlagX5 = true;
					moveCount++;
				}
				else if(turnForX == false && markedFlag5 == false){
					markButton5.setIcon(new ImageIcon(imageO));
					turnForX = true;
					buttonFlagO5 = true;
					moveCount++;
				}
				markedFlag5 = true;
				checkGameState();
			}
		});
		contentPane.add(markButton5);
		
		markButton6 = new JButton("");
		markButton6.setBounds(270, 142, 120, 120);
		markButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turnForX == true && markedFlag6 == false) {
					markButton6.setIcon(new ImageIcon(imageX));
					turnForX = false;
					buttonFlagX6 = true;
					moveCount++;
				}
				else if(turnForX == false && markedFlag6 == false){
					markButton6.setIcon(new ImageIcon(imageO));
					turnForX = true;
					buttonFlagO6 = true;
					moveCount++;
				}
				markedFlag6 = true;
				checkGameState();
			}
		});
		contentPane.add(markButton6);
		
		markButton7 = new JButton("");
		markButton7.setBounds(10, 273, 120, 127);
		markButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turnForX == true && markedFlag7 == false) {
					markButton7.setIcon(new ImageIcon(imageX));
					turnForX = false;
					buttonFlagX7 = true;
					moveCount++;
				}
				else if(turnForX == false && markedFlag7 == false){
					markButton7.setIcon(new ImageIcon(imageO));
					turnForX = true;
					buttonFlagO7 = true;
					moveCount++;
				}
				markedFlag7 = true;
				checkGameState();
			}
		});
		contentPane.add(markButton7);
		
		markButton8 = new JButton("");
		markButton8.setBounds(140, 273, 120, 127);
		markButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turnForX == true && markedFlag8 == false) {
					markButton8.setIcon(new ImageIcon(imageX));
					turnForX = false;
					buttonFlagX8 = true;
					moveCount++;
				}
				else if(turnForX == false && markedFlag8 == false){
					markButton8.setIcon(new ImageIcon(imageO));
					turnForX = true;
					buttonFlagO8 = true;
					moveCount++;
				}
				markedFlag8 = true;
				checkGameState();
			}
		});
		contentPane.add(markButton8);
		
		markButton9 = new JButton("");
		markButton9.setBounds(270, 273, 120, 127);
		markButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turnForX == true && markedFlag9 == false) {
					markButton9.setIcon(new ImageIcon(imageX));
					turnForX = false;
					buttonFlagX9 = true;
					moveCount++;
				}
				else if(turnForX == false && markedFlag9 == false){
					markButton9.setIcon(new ImageIcon(imageO));
					turnForX = true;
					buttonFlagO9 = true;
					moveCount++;
				}
				markedFlag9 = true;
				checkGameState();
			}
		});
		contentPane.add(markButton9);
		
		gameStateLabel = new JLabel("");
		gameStateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gameStateLabel.setBounds(128, 411, 143, 14);
		contentPane.add(gameStateLabel);
		
		newGameButton = new JButton("New Game");
		newGameButton.setBounds(270, 402, 120, 23);
		newGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turnForX = true;
				moveCount = 0;
				
				markedFlag1 = false;
				markedFlag2 = false;
				markedFlag3 = false;
				markedFlag4 = false;
				markedFlag5 = false;
				markedFlag6 = false;
				markedFlag7 = false;
				markedFlag8 = false;
				markedFlag9 = false;
				
				buttonFlagO1 = false;
				buttonFlagX1 = false;
				buttonFlagO2 = false;
				buttonFlagX2 = false;
				buttonFlagO3 = false;
				buttonFlagX3 = false;
				buttonFlagO4 = false;
				buttonFlagX4 = false;
				buttonFlagO5 = false;
				buttonFlagX5 = false;
				buttonFlagO6 = false;
				buttonFlagX6 = false;
				buttonFlagO7 = false;
				buttonFlagX7 = false;
				buttonFlagO8 = false;
				buttonFlagX8 = false;
				buttonFlagO9 = false;
				buttonFlagX9 = false;
				
				markButton1.setIcon(new ImageIcon());
				markButton2.setIcon(new ImageIcon());
				markButton3.setIcon(new ImageIcon());
				markButton4.setIcon(new ImageIcon());
				markButton5.setIcon(new ImageIcon());
				markButton6.setIcon(new ImageIcon());
				markButton7.setIcon(new ImageIcon());
				markButton8.setIcon(new ImageIcon());
				markButton9.setIcon(new ImageIcon());
				
				markButton1.setBackground(null);
				markButton2.setBackground(null);
				markButton3.setBackground(null);
				markButton4.setBackground(null);
				markButton5.setBackground(null);
				markButton6.setBackground(null);
				markButton7.setBackground(null);
				markButton8.setBackground(null);
				markButton9.setBackground(null);
				
			}
		});
		contentPane.add(newGameButton);
		}
	
		public void checkGameState() {
			if(buttonFlagX1 == true && buttonFlagX2 == true && buttonFlagX3 == true) {
				markButton1.setBackground(Color.blue);
				markButton2.setBackground(Color.blue);
				markButton3.setBackground(Color.blue);
				markedFlag4 = true;
				markedFlag5 = true;
				markedFlag6 = true;
				markedFlag7 = true;
				markedFlag8 = true;
				markedFlag9 = true;
				gameStateLabel.setText("Player X wins.");
			}
			else if(buttonFlagX4 == true && buttonFlagX5 == true && buttonFlagX6 == true) {
				markButton4.setBackground(Color.blue);
				markButton5.setBackground(Color.blue);
				markButton6.setBackground(Color.blue);
				markedFlag1 = true;
				markedFlag2 = true;
				markedFlag3 = true;
				markedFlag7 = true;
				markedFlag8 = true;
				markedFlag9 = true;
				gameStateLabel.setText("Player X wins.");
			}
			else if(buttonFlagX7 == true && buttonFlagX8 == true && buttonFlagX9 == true) {
				markButton7.setBackground(Color.blue);
				markButton8.setBackground(Color.blue);
				markButton9.setBackground(Color.blue);
				markedFlag1 = true;
				markedFlag2 = true;
				markedFlag3 = true;
				markedFlag4 = true;
				markedFlag5 = true;
				markedFlag6 = true;
				gameStateLabel.setText("Player X wins.");
			}
			else if(buttonFlagX1 == true && buttonFlagX4 == true && buttonFlagX7 == true ) {
				markButton1.setBackground(Color.blue);
				markButton4.setBackground(Color.blue);
				markButton7.setBackground(Color.blue);
				markedFlag2 = true;
				markedFlag3 = true;
				markedFlag5 = true;
				markedFlag6 = true;
				markedFlag8 = true;
				markedFlag9 = true;
				gameStateLabel.setText("Player X wins.");
			}
			else if(buttonFlagX2 == true && buttonFlagX5 == true && buttonFlagX8 == true) {
				markButton2.setBackground(Color.blue);
				markButton5.setBackground(Color.blue);
				markButton8.setBackground(Color.blue);
				markedFlag1 = true;
				markedFlag3 = true;
				markedFlag4 = true;
				markedFlag6 = true;
				markedFlag7 = true;
				markedFlag9 = true;
				gameStateLabel.setText("Player X wins.");
			}
			else if(buttonFlagX3 == true && buttonFlagX6 == true && buttonFlagX9 == true) {
				markButton3.setBackground(Color.blue);
				markButton6.setBackground(Color.blue);
				markButton9.setBackground(Color.blue);
				markedFlag1 = true;
				markedFlag2 = true;
				markedFlag4 = true;
				markedFlag5 = true;
				markedFlag7 = true;
				markedFlag8 = true;
				gameStateLabel.setText("Player X wins.");
			}
			else if(buttonFlagX1 == true && buttonFlagX5 == true && buttonFlagX9 == true) {
				markButton1.setBackground(Color.blue);
				markButton5.setBackground(Color.blue);
				markButton9.setBackground(Color.blue);
				markedFlag2 = true;
				markedFlag3 = true;
				markedFlag4 = true;
				markedFlag6 = true;
				markedFlag7 = true;
				markedFlag8 = true;
				gameStateLabel.setText("Player X wins.");
			}
			else if(buttonFlagX7 == true && buttonFlagX5 == true && buttonFlagX3 == true) {
				markButton7.setBackground(Color.blue);
				markButton5.setBackground(Color.blue);
				markButton3.setBackground(Color.blue);
				markedFlag1 = true;
				markedFlag2 = true;
				markedFlag4 = true;
				markedFlag6 = true;
				markedFlag8 = true;
				markedFlag9 = true;
				gameStateLabel.setText("Player X wins.");
			}
			else if(buttonFlagO1 == true && buttonFlagO2 == true && buttonFlagO3 == true) {
				markButton1.setBackground(Color.blue);
				markButton2.setBackground(Color.blue);
				markButton3.setBackground(Color.blue);
				markedFlag4 = true;
				markedFlag5 = true;
				markedFlag6 = true;
				markedFlag7 = true;
				markedFlag8 = true;
				markedFlag9 = true;
				gameStateLabel.setText("Player O wins.");
			}
			else if(buttonFlagO4 == true && buttonFlagO5 == true && buttonFlagO6 == true) {
				markButton4.setBackground(Color.blue);
				markButton5.setBackground(Color.blue);
				markButton6.setBackground(Color.blue);
				markedFlag1 = true;
				markedFlag2 = true;
				markedFlag3 = true;
				markedFlag7 = true;
				markedFlag8 = true;
				markedFlag9 = true;
				gameStateLabel.setText("Player O wins.");
			}
			else if(buttonFlagO7 == true && buttonFlagO8 == true && buttonFlagO9 == true) {
				markButton7.setBackground(Color.blue);
				markButton8.setBackground(Color.blue);
				markButton9.setBackground(Color.blue);
				markedFlag1 = true;
				markedFlag2 = true;
				markedFlag3 = true;
				markedFlag4 = true;
				markedFlag5 = true;
				markedFlag6 = true;
				gameStateLabel.setText("Player O wins.");
			}
			else if(buttonFlagO1 == true && buttonFlagO4 == true && buttonFlagO7 == true ) {
				markButton1.setBackground(Color.blue);
				markButton4.setBackground(Color.blue);
				markButton7.setBackground(Color.blue);
				markedFlag2 = true;
				markedFlag3 = true;
				markedFlag5 = true;
				markedFlag6 = true;
				markedFlag8 = true;
				markedFlag9 = true;
				gameStateLabel.setText("Player O wins.");
			}
			else if(buttonFlagO2 == true && buttonFlagO5 == true && buttonFlagO8 == true) {
				markButton2.setBackground(Color.blue);
				markButton5.setBackground(Color.blue);
				markButton8.setBackground(Color.blue);
				markedFlag1 = true;
				markedFlag3 = true;
				markedFlag4 = true;
				markedFlag6 = true;
				markedFlag7 = true;
				markedFlag9 = true;
				gameStateLabel.setText("Player O wins.");
			}
			else if(buttonFlagO3 == true && buttonFlagO6 == true && buttonFlagO9 == true) {
				markButton3.setBackground(Color.blue);
				markButton6.setBackground(Color.blue);
				markButton9.setBackground(Color.blue);
				markedFlag1 = true;
				markedFlag2 = true;
				markedFlag4 = true;
				markedFlag5 = true;
				markedFlag7 = true;
				markedFlag8 = true;
				gameStateLabel.setText("Player O wins.");
			}
			else if(buttonFlagO1 == true && buttonFlagO5 == true && buttonFlagO9 == true) {
				markButton1.setBackground(Color.blue);
				markButton5.setBackground(Color.blue);
				markButton9.setBackground(Color.blue);
				markedFlag2 = true;
				markedFlag3 = true;
				markedFlag4 = true;
				markedFlag6 = true;
				markedFlag7 = true;
				markedFlag8 = true;
				gameStateLabel.setText("Player O wins.");
			}
			else if(buttonFlagO7 == true && buttonFlagO5 == true && buttonFlagO3 == true) {
				markButton7.setBackground(Color.blue);
				markButton5.setBackground(Color.blue);
				markButton3.setBackground(Color.blue);
				markedFlag1 = true;
				markedFlag2 = true;
				markedFlag4 = true;
				markedFlag6 = true;
				markedFlag8 = true;
				markedFlag9 = true;
				gameStateLabel.setText("Player O wins.");
			}
			else if(moveCount == 9) {
				gameStateLabel.setText("Draw");
			}
			
		}
	}

