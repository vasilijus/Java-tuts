import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";		

		do {
			// TODO Generate a rand number 
			int theNumber = (int) (Math.random() * 100 + 1);
			// System.out.println(theNumber);
			int guess = 0;
			int numberOftimes = 0;
			
			while (guess != theNumber) {
				numberOftimes = numberOftimes + 1;
				System.out.println(" Guess a number between 1 and 100: ");
				guess = scan.nextInt();

				if ( guess < theNumber ) {
					System.out.println(guess + " is too low. Try again. ");
				} else if ( guess > theNumber ) {
					System.out.println(guess + " is too high. Try again. ");
				} else {
					System.out.println("Congrats, You guessed right: " + guess);
					System.out.println("It only took you " + numberOftimes + " times to guess...");
				}
			} // End of while
			System.out.println("Would you like to play again (y/n)? ");
			playAgain = scan.next();
			
		} while ( playAgain.equalsIgnoreCase("y")); // End of Do While
		
		System.out.println("Thanks for playing.");
		scan.close();

	}

}
