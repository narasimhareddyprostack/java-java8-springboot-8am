package coom.oops;

public class Account  extends Object{
	
	private int acc_Id;
	private String acc_Name;
	
	public Account(int id, String name){
		System.out.println("Account class-const");
		this.acc_Id = id;
		this.acc_Name=name;
		
	}
	//business logic 
	public void open_Account() {}
		public void deposit() {}
	
		public static void main(String[] args) {
		Account a1 = new Account(101,"Rahul");
	}
}
