class Employee{
	String name; 
	int salary; 
	public Employee(){
		name = "Bob the Builder";
		salary = 20000;
	}
	public Employee(String empName, int empSalaray){
		name = empName;
		salary = empSalaray;
	}
	public void printEmployee(){
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("This employee is underpaid");
	}
	
}
class starter{
	public static void main(String args[]){
		Employee bobbert = new Employee();           
		Employee bobby = new Employee("Bob", 120000);
		bobbert.printEmployee();
	}
}