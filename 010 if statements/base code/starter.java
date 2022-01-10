import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand_num1 = rand.nextInt(10);
		System.out.println(rand_num1);
		int rand_num2 = rand.nextInt(10); 
		System.out.println(rand_num2);
		if(rand_num1 != rand_num2)
		{
			System.out.println("different");
		}
		if(rand_num1 == rand_num2)
		{
			System.out.println("equal");
		}
	}
}
