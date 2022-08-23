class Test{
	public static void main(String[] args){
		//int x = ++10; // we cant apply incr/decr for literal
      /*   int a = 10;
		int b = ++(a++); */
		double pi=3.14;
		double x = pi++;
		System.out.println(x); 	//3.14
		System.out.println(pi); //4.14	
		}
}