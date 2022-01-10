import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println();
		while(true){
		System.out.print("Would you like to play the slots (Yes/yes/Y/y): ");
		String mhm = sc.nextLine();
		int rand_num1 = rand.nextInt(10);
		int rand_num2 = rand.nextInt(10);
		int rand_num3 = rand.nextInt(10);
		
		if((mhm.equals("Yes")) || (mhm.equals("yes")) || (mhm.equals("y")) || (mhm.equals("Y"))) {
			System.out.print("You have $100. How much would you like to wager? ");
			int one = sc.nextInt();
			int counter = 100;
			int ch = counter;
			if(one>ch){
				System.out.print("You only have ");
				System.out.print(ch);
				System.out.println(" ! Please enter a smaller number: ");
			}
			System.out.println();
			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are: ");
			System.out.println("____________________________");
			System.out.print("    |  ");
			System.out.print(rand_num1);
			System.out.print("  |  ");
			System.out.print(rand_num2);
			System.out.print("  |  ");
			System.out.print(rand_num3);
			System.out.println("  |  ");
			System.out.println("____________________________");
			
		
		if((rand_num1 == rand_num2) && (rand_num2 == rand_num3)){
			System.out.println("JACKPOT! You're wager has now been tripled!");
			System.out.print("You now have $");
			int b = one*3;
			System.out.print(ch);
			System.out.println(".");
			System.out.println();
			System.out.println("---------------------------------------------------------");
			System.out.println();
		}
	
		if(((rand_num3 == rand_num2) && (rand_num1 != rand_num3)) || ((rand_num3 == rand_num1) && (rand_num2 != rand_num3)) || ((rand_num1 == rand_num2) && (rand_num1 != rand_num3)));{
			System.out.println("You won! You're wager has now been doubled!");
			System.out.print("You now have $");
			int b = one*2;
			System.out.print(ch);
			System.out.println(".");
			System.out.println();
			System.out.println("---------------------------------------------------------");
			System.out.println();
		}
		
		if((rand_num1 != rand_num2) && (rand_num1 != rand_num3) && (rand_num2 != rand_num3)){
			System.out.println("Didn't win this time, better luck next time!");
			System.out.print("You now have $");
			int b = -one;
			System.out.print(ch);
			System.out.println(".");
			System.out.println();
			System.out.println("---------------------------------------------------------");
			System.out.println();
		}
	
		if(ch == 0){
			System.out.println("You've run out of money! Thanks for coming! Come back soon!");
			break;
		}
		}
		
		else if((mhm.equals("No")) || (mhm.equals("no")) || (mhm.equals("N"))|| (mhm.equals("n"))){
			System.out.println("Sad to see you go! You still have $100 left. Come again soon! Thanks!");
		}
		else{
			System.out.println("That wasn't quite the correct answer. Try again.");
			System.out.println("--------------------------------------------------");
			System.out.println();
		}
	
		
		
		
}

}
}


