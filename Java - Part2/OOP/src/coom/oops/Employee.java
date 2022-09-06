package coom.oops;

public class Employee {
	private int emp_Id;

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.setEmp_Id(101);
		System.out.println(e1.getEmp_Id());
		
	}
}
