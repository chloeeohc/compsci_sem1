import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] x;
		int y;
		int t = rand.nextInt(149) + 51;
		x = new int[t];
		y = 0;
		int min = 100;
		int max = 1;
		
		while(y<x.length){
			x[y] = rand.nextInt(100) + 1;
			y = y + 1;
		}
		System.out.print("There are ");
		System.out.print(y);
		System.out.println(" elements.");
		
		y = 0;
		while(y<x.length){
			x[y] = rand.nextInt(100)+1;
			y = y+1;
			if(x[y]<min){
				min = x[y];
			}
			y = y +1;
		}
		System.out.print("The minimum of 1000 random numbers is: ");
		System.out.println(min);

		y=0;
		while(y<x.length){
			if(x[y]>max){
				max = x[y];
			}
			y = y + 1;
		}
		
		System.out.print("The maximum of 1000 random numbers is: ");
		System.out.println(max);
		
		y = 0;
		int b = x[y];
		while(x[y + 1] < x.length)
		{
			b = b + x[y + 1];
			y++;
		}
		
		int h = b/x.length;
		System.out.print("The average of 1000 random numbers is: ");
		System.out.println(h);
		}
	}