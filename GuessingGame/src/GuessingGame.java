import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Component; // awt - abstract window toolkit
import java.awt.Dimension;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	private int numberOfTimes;
	
	public void checkGuess() {
		
		String guessText = txtGuess.getText();
		String message = "";
		numberOfTimes = numberOfTimes + 1;
		try {
			int guess = Integer.parseInt(guessText);
			
			if (guess < theNumber) {
				message = guess + " is too low.Try again.";
			} else if (guess < theNumber) {
				message = guess + " is too high.Try again.";
			} else {
				message = guess + " is correct. You win! In only " + numberOfTimes + " turns ... Let's play again !";
				newGame();
			}
		} catch (Exception e) {
			message = "Enter a whole number between 1 and 100.";
		} finally {
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}
		
	}
	
	public void newGame() {
	
		theNumber = (int)(Math.random() * 100 + 1);
		
	}
	
	public GuessingGame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sergej's Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblGuessingGameTitle = new JLabel("Sergej Guessing Game");
		lblGuessingGameTitle.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblGuessingGameTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuessingGameTitle.setBounds(12, 12, 416, 38);
		getContentPane().add(lblGuessingGameTitle);
		
		JLabel lblGuessNumber = new JLabel("Guess a number between 1 and 100: ");
		lblGuessNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuessNumber.setBounds(12, 65, 416, 21);
		getContentPane().add(lblGuessNumber);
		
		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setBounds(12, 94, 139, 30);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setBounds(175, 95, 114, 25);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(12, 135, 416, 30);
		getContentPane().add(lblOutput);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize( new Dimension(450,300) );
		theGame.setVisible( true );

	}
}
