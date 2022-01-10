import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class Hangman{
	private String generateWord;
	private int numTries;
	
	
	public Hangman(){
		generateWord();
		numTries = 5;
	}
	 public Hangman(int a){
		generateWord();
		numTries = a;
		
	}
	
	public int guessFirst(String x, int z ){
		z=-1;
			for(y=0; y<generateWord.length; y++){
				if(x.equals(generateWord.substring(y,y+1))){
					return y;
				}
				else{
					return z;
				}
	}
	}
	
	public boolean checkWin(boolean[]){
		if(guessFirst() = true){
			return true;
		}
		else{
			return false;
		}
	}
}


public static void main(String args[]){
	

public static int getMode(int[]arr){
	while(int [] arr1 )
}

public static int getMedian(int[]arr){
	
}