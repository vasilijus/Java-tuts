import java.util.Scanner;


public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String color = ""; 
		System.out.print("Enter Color: ");
			color = scan.nextLine();
		String pastTenseVerb = ""; 
		System.out.print("Enter Past tense verb(doing smth...): ");
			pastTenseVerb = scan.nextLine();
		String adjective = ""; 
		System.out.print("Enter Adj.: ");
			adjective = scan.nextLine();
		String noun = ""; 
		System.out.print("Enter Noun: ");
			noun = scan.nextLine();
		
		System.out.println("");
		System.out.print("The "+ color + " dragon " + pastTenseVerb + " at the " + adjective);
		System.out.println(" knight, who rode in on a sturdy, giant " + noun + ".");
		
		scan.close();
	}

}
