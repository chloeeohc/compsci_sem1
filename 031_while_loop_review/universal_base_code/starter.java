import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int x = rand.nextInt(100);
		int b = x+1;
		while(true){
			System.out.println(b);
			if(b == 100){
				break;
			}
			x = rand.nextInt(100);
			b = x+1;
		}

	}
}
