import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// TODO Generate a rand number 
		int theNumber = (int) (Math.random() * 100 + 1);
		// System.out.println(theNumber);
		int guess = 0;
		while (guess != theNumber) {
			System.out.println(" Guess a number between 1 and 100: ");
			guess = scan.nextInt();
//			System.out.println("You entered " + guess + ".");
			if ( guess < theNumber ) {
				System.out.println(guess + " is too low. Try again. ");
			} else if ( guess > theNumber ) {
				System.out.println(guess + " is too high. Try again. ");
			} else {
				System.out.println("Congrats, You guessed right: " + guess);
			}
		}
		
	}

}
