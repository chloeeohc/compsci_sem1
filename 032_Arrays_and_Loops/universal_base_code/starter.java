import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] x;
		int y;
		x = new int[1000];
		y = 0;
		
		while(y<1000){
			x[y] = rand.nextInt(1000);
			y++;
		}

		y = 0;
		while(y<1000){
			System.out.println(x[y]);
			y++;
			}
		}
	}

