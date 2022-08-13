class Test{
    int a = 10;
	static int b = 100;
	public static void main(String[] args){
	    Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1);//hashcode
		System.out.println(t2);//hashcode
		//System.out.println(a);//CError
		System.out.println(t1.a);//hashcode
		System.out.println(t1.b);
		System.out.println(b);
		
	}
}