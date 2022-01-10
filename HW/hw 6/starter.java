import java.util.Scanner;
import java.util.Random;
class starter {
	public static boolean checkPrime(int x){
		int a = x;
		while(true){
			int y = x%a;
			if(y == 0){
				return false;
			}
			else{
				return true;
			}
			a = a - 1;
		}
	}
	
	public static void printPrimes(int x){
		int a = x;
		while(true){
			int y = x%a;
			if(y != 0){
				System.out.println(y);
			}
			else{
				return;
			}
			a = a - 1;
		}
	
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int x = sc.nextInt();
		checkPrime(x);
		printPrimes(x);
	
}
}
