import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = sc.nextInt();
		System.out.print("Enter another integer: ");
		int b = sc.nextInt();
		System.out.println();
		if(a %2 != 0) 
		{
			System.out.print(a);
			System.out.println(" is odd.");
		}
		else
		{
			System.out.print(a);
			System.out.println(" is even.");
		}
		
		if(b%2 != 0)
		{
			System.out.print(b);
			System.out.println(" is odd.");
		}
		else
		{
			System.out.print(b);
			System.out.println(" is even.");
		}
		System.out.println();
		System.out.print(a);
		System.out.println(" is not divisible by:");
		if(a%3 != 0) 
		{
			System.out.println(3);
		}
		if(a%4 != 0)
		{
			System.out.println(4);
		}
		if(a%5 != 0)
		{
			System.out.println(5);
		}
		System.out.println();
		System.out.print(b);
		System.out.println(" is not divisible by:");
		if(b%3 != 0) 
		{
			System.out.println(3);
		}
		if(b%4 != 0)
		{
			System.out.println(4);
		}
		if(b%5 != 0)
		{
			System.out.println(5);
		}
	}
}
