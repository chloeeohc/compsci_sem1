import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String x = sc.nextLine();
		int [] w = null;
		
		for(int y =0; y<x.length(); y++){
			w = new int[y];
			w[y] = x.indexOf(" ");
			
		}
		
		System.out.print()
		
	}
}
