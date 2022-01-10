
import java.util.Scanner;
import java.util.Random;

class starter {
	
		public static void main(String args[]) {
		Random rand = new Random();
        int[] randInts = new int[20];
        
        for(int a = 0;a<randInts.length;a++){
            randInts[a] = rand.nextInt(10)+1;
        }
        
        System.out.println("Array: ");
        
        for(int c = 0; c<randInts.length; c++){
            System.out.print(randInts[c]+" ");
        }
        System.out.println();
        
        int duplicateTarget = rand.nextInt(9)+1;
        int numberOfDuplicates = 0;
        
        System.out.println("The duplicate target is "+duplicateTarget);
        System.out.print("The indexes for the duplicates are");
        
        for(int b = 0;b<randInts.length;b++){
            
            if(randInts[b] == duplicateTarget){
                
                System.out.print(" "+b);
                numberOfDuplicates++;
                
            }
        }
        
        System.out.println("The total number of duplicates is "+numberOfDuplicates);
        System.out.println();
     
			int backInt = 0;
			int frontInt = 0;
			
			for(int d = 0; d<randInts.length-1; d++){
				backInt = randInts[d];
				frontInt = randInts[d+1];
				
				if(backInt == frontInt){
					System.out.println("Indexes "+d+" and "+(d+1)+" are both equal to "+randInts[d]);
				}
			}
		}
}
	
