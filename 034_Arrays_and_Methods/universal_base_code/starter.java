import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int[]x){
		Random rand = new Random();
		int y = 0; 
		while(y<x.length){
			x[y] = rand.nextInt(100) + 1;
			System.out.println(x[y]);
			y = y + 1;
		}
		return;
	}
	public static int[] getArrayAverage(int[]x){
		Random rand = new Random();
		int y = 0; 
		int b= x[y];
		while(x[y + 1] < x.length)
		{
			b= b + x[y + 1];
			y++;
		}
			
		int h = b/x.length;
		System.out.print("The average of 1000 random numbers is: ");
		System.out.println(h);	
		return x;
	}
	public static int[] getArrayMax(int[]x){
		Random rand = new Random();
		int y = 0; 
		int max = 1;
		while(y<x.length){
			if(x[y]>max){
				max = x[y];
			}
			y = y + 1;
		}
		
		System.out.print("The maximum of 1000 random numbers is: ");
		System.out.println(max);
		return x;
	}
	public static int[] getArrayMin(int[]x){
		Random rand = new Random();
		int y = 0; 
		int min = 100;
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
		return x;
	}
	
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		Random rand = new Random();
		int[] x;
		int t = rand.nextInt(100) + 1;
		x = new int[t];
		
		toStringArray(x);
	
		getArrayMax(x);
		getArrayMin(x);
		getArrayAverage(x);
		
	}
}