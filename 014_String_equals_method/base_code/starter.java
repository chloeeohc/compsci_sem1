import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
	String b = sc.nextLine();
	
	if((b.equals("Wizard")) || (b.equals("wizard"))){
		System.out.println("You've chosen the Wizard! Excelsior!");
	}
	if((b.equals("Warrior")) || (b.equals("warrior"))){
		System.out.println("You've chosen the Warrior! For honor!");
	}
	if((b.equals("Rogue")) || (b.equals("rogue"))){
		System.out.println("You've chosen the Rogue! How cunning!");
	}
	}
	}
