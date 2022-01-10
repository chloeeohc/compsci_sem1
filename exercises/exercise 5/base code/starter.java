import java.util.Scanner;
class cat{
	String name;
	public cat(){
		name = new String("Garfield");
	}
	
	public cat(String a){
		name = a;
	}
	
	public void meow(){
		System.out.println("The cat's name is " +name+ " and he meows.");
		return;
	}
	
}

class starter{
	public static void main(String args[]){
		cat x = new cat();
		cat y = new cat("adjawdakwdaw");
		x.meow();
		y.meow();
	}
}