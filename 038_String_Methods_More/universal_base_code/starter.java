import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first and last name with a space in the middle.");
		String x = sc.nextLine();
		int s = x.indexOf(" ");
		String v = x.substring(s+1);
		
		
		System.out.println("The last name is: " + v);
	}
}
