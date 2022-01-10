import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rand_num1 = rand.nextInt(1000);
		int a = sc.nextInt();
		if(rand_num1 == a)
		{
			System.out.println("CORRECT");
		}
		else
		{
			System.out.println("WRONG");
		}
	}
}
