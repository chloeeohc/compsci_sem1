import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter{
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Type: ");
			String a = sc.nextLine();
			System.out.print("Name: ");
			String b = sc.nextLine();
			System.out.print("oneLine: ");
			String c = sc.nextLine();
			System.out.print("Number: ");
			int d = sc.nextInt(); 
			
		Ascii Human = new Ascii();
		Ascii Dog = new Ascii();
		Ascii Cactus = new Ascii();
		Ascii Other = new Ascii();
		Ascii square = new Ascii();
		
		if(a.equals("Human")){
			Human.setType();
			Human.setName();
			Human.setNumber();
			Human.printArt();
		}
		else if(a.equals("Dog")){
			Dog.setType();
			Dog.setName();
			Dog.setNumber();
			Dog.printArt();
		}
		else if(a.equals("Cactus")){
			Cactus.setType();
			Cactus.setName();
			Cactus.setNumber();
			Cactus.printArt();
		}
		else if(a.equals("Other")){
			Other.setType();
			Other.setName();
			Other.setNumber();
			Other.printArt();
		}
		else if(a.equals("square")){
			square.setType();
			square.setName();
			square.setNumber();
			square.printArt();
		}
	}
	
}