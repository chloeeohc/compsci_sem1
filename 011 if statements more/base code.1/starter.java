import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println();
		if((a>b) && (a>c))
		{
			System.out.println(a);
		}
		if((b>c) && (b>a))
		{
			System.out.println(b);
		}
		if((c>b) && (c>a))
		{
			System.out.println(c);
		}
		System.out.println();
		if((a<b) && (a<c)) 
		{
			System.out.println(a);
		}
		if((b<a) && (b<c))
		{
			System.out.println(b);
		}
		if((c<a) && (c<b))
		{
			System.out.println(c);
		}
	}
}
