package coom.oops;

public class Emp {
	int emp_Id;
	String emp_Name;
	Emp(){
		super();
		System.out.println("Emp class - const");
		
	}
	
	public static void main(String[] args) {
		Emp e1= new Emp();
	}
}
