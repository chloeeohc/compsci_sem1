import java.util.Scanner;
class starter {
	public static int exercise(int a, int b){
		int x = a;
		int y = b;
		int pro = a*b; 
		if(pro%3 == 0){
			System.out.println(pro);
		}
			return pro;
	}
	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int a = sc.nextInt();
	System.out.print("Enter another integer: ");
	int b = sc.nextInt();
	exercise(a,b);
	}
}
