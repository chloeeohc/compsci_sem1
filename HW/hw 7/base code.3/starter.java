import java.util.Scanner;
import java.util.Random;

class Dog {
	String name;
	String breed;
	int age;

	public Dog()
	{
		name = new String("Clifford");
		age = 3;
		breed = "Big red dog";
	}
	public Dog(String a)
	{
		name = a;
		age = 1;
		breed = "Dog dog";
	}
	public Dog(String a, String b)
	{
		name = a;
		age = 1;
		breed = b;
	}
	public Dog(String a, int b)
	{
		name = a;
		age = b;
		breed = "Dog dog";
	}
	public void setName(String a){
		name = a;
		return;
	}
	public void setAge(int a){
		age = a;
		return;
	}
	public void setBreed(String a){
		breed = a;
		return;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public void bark()
	{
		System.out.println(name + " Barks");
		return;
	}
	public boolean isSleeping(){
		Random rand = new Random();
		boolean x = rand.nextBoolean();
		if(x)
			return true;
		else
			return false;
	}

}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		Dog a = new Dog(sc.nextLine());
		System.out.println("What age should " + a.getName() + " be?");
		a.setAge(sc.nextInt());
		System.out.println (a.getName() + " is a " + a.getBreed() + " that is " + a.getAge() + " years old!");

		Dog b = new Dog("Toto", "Cairn Terrier");
		System.out.println (b.getName() + " is a " + b.getBreed() + " that is " + b.getAge() + " years old!");

		boolean x = a.isSleeping();
		if(x){
			System.out.println(a.getName() + " is sleeping! Don't wake " + a.getName() + " up!");
		}
		else{
			System.out.println(a.getName() + " is awake!");
			a.bark();
		}

		boolean y = b.isSleeping();
		if(y && x){
			System.out.println(b.getName() + " is sleeping too!");
		}
		else if(!y && x){
			System.out.println(b.getName() + " isn't sleeping!");
		}
		else if(y && !x){
			System.out.println(b.getName() + " wakes up from hearing " + a.getName());
			b.bark();
		}
		else{
			System.out.println(b.getName() + " hears " + a.getName() + "!");
			b.bark();
		}


		


	}
}