import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String x){
		System.out.println(x);
		return;
	}
	public static void toStringCombined(String x, String y) {
		System.out.println(x + " " + y);
		return;
	}
	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Write a sentence!");
	String x = sc.nextLine();
	System.out.println("Write a sentence!");
	String y = sc.nextLine();
	System.out.println();

	System.out.println("This is using the methods!");
	toString(x);
	toStringCombined(x,y);
	}

}