import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void substring(String x){
	
		System.out.println("Letter by letter:");
		for(int y =0; y<x.length(); y++){
			System.out.println(y + " " + x.substring(y, y+1));

		}
		return;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word.");
		String x = sc.nextLine();
		substring(x);
		
	}
}

