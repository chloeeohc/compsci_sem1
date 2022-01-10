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
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		// Your code goes below here
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
