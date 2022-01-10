import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String a = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String c = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String b = sc.nextLine();
		System.out.println();
	
	if((b.equals("Wizard")) || (b.equals("wizard"))){
		System.out.println("You've chosen the Wizard! Excelsior!");
	}
	if((b.equals("Warrior")) || (b.equals("warrior"))){
		System.out.println("You've chosen the Warrior! For honor!");
	}
	if((b.equals("Rogue")) || (b.equals("rogue"))){
		System.out.println("You've chosen the Rogue! How cunning!");
	}
	else
	{
		System.out.println("You've decided not to choose a role. Rerun program.");
	}
		System.out.println();
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println();
		System.out.print("Strength (1-10): ");
		int aa = sc.nextInt();
		int aaa = 25-aa;
		System.out.print("You have ");
		System.out.print(aaa);
		System.out.println(" left to spend.");
		System.out.println();
		System.out.print("Dexterity (1-10): ");
		int bb = sc.nextInt();
		int bbb = aaa - bb;
		System.out.print("You have ");
		System.out.print(bbb);
		System.out.println(" left to spend.");
		System.out.println();
		System.out.print("Intelligence (1-10): ");
		int cc = sc.nextInt();
		int ccc = bbb - cc;
		System.out.print("You have ");
		System.out.print(ccc);
		System.out.println(" left to spend.");
		System.out.println();
		System.out.print("Constitution (1-10): ");
		int dd = sc.nextInt();
		int ddd = ccc - dd; 
		System.out.print("You have ");
		System.out.print(ddd);
		System.out.println(" left to spend.");
		System.out.println();
		System.out.print("Charisma (1-10): ");
		int ee = sc.nextInt();
		System.out.print("You have ");
		int rr = 25-ee;
		System.out.print(rr);
		System.out.println(" to spend for next time.");
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.print("You are ");
		System.out.print(a);
		System.out.print(", the ");
		System.out.print(c);
		System.out.println(" of CVHS.");
		System.out.print("You are a ");
		System.out.print(b);
		System.out.println(" with the following stats!");
		System.out.print("Strength - ");
		System.out.println(aa);
		System.out.print("Dexterity - ");
		System.out.println(bb);
		System.out.print("Intelligence - ");
		System.out.println(cc);
		System.out.print("Constitution - ");
		System.out.println(dd);
		System.out.print("Charisma - ");
		System.out.println(ee);
		System.out.println();
		System.out.print("Good luck on your quest ");
		System.out.print(a);
		System.out.print("!");
		
		
	}
}
