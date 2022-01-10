import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int input = sc.nextInt();
		
		System.out.println(input);
		System.out.println(input+1);
		System.out.println(input+2);
		System.out.println(input+3);
		System.out.println(input+4);
	}
}
