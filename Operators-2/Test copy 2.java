class Test{
	public static void main(String[] args){
		int x = 10;
		int y =  ++x; 
		// pre incr - First incr then assign
		System.out.println(x);  //11
		System.out.println(y); //11
	}
}