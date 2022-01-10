import pkg.*;
import java.util.Scanner;
import java.util.Random;

class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution; 
	int charisma;
	public void myToString(String role, int strength, int dexterity, int intelligence, int constitution, int charisma){
		role = ("Wizard");
		System.out.println(role);
		System.out.print("Your strength trait is ");
		System.out.println(strength);
		System.out.print("Your dexterity trait is ");
		System.out.println(dexterity);
		System.out.print("Your intelligence trait is ");
		System.out.println(intelligence);
		System.out.print("Your constitution trait is ");
		System.out.println(constitution);
		System.out.print("Your charisma trait is ");
		System.out.println(charisma);
		
		return;
	}
}
	
