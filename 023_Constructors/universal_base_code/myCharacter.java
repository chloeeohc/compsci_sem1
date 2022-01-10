import pkg.*;
import java.util.Scanner;
import java.util.Random;
class Character{
	String role = new String("Wizard");
	int strength = 5;
	int dexterity = 5;
	int intelligence = 5;
	int constitution = 5;
	int charisma = 5;
}


class myCharacter {
	String role;
	public myCharacter(){
		role = new String("no role");
	}
	public myCharacter(String b){
		role = b;
	}
	public static void main(String args[]) {

		BaseClass test = new BaseClass();
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
		Character myCharacter = new Character();
		System.out.println(myCharacter.role);
		System.out.print("Your strength trait is ");
		System.out.println(myCharacter.strength);
		System.out.print("Your dexterity trait is ");
		System.out.println(myCharacter.dexterity);
		System.out.print("Your intelligence trait is ");
		System.out.println(myCharacter.intelligence);
		System.out.print("Your constitution trait is ");
		System.out.println(myCharacter.constitution);
		System.out.print("Your charisma trait is ");
		System.out.println(myCharacter.charisma);
		

	}
}
