class Test{
	public static void main(String[] args){
		int x = 10;
		int y =  x++; 
		// post incr - first assign then incr
		System.out.println(x);  //11
		System.out.println(y); //10
	}
}