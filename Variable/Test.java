class Test{
    int a = 10;
	static int b = 100;
	String name;
	
	static int country_Code;
	public static void main(String[] args){
	    Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1.name);
		System.out.println(t2.name);
		System.out.println(t1.country_Code);
		System.out.println(t2.country_Code);
		t2.a = 15;
		System.out.println(t1.a + b);  //110
		System.out.println(t2.a + b);  //115
		b = 200;
		
		System.out.println(t1.a + b);  //210
		System.out.println(t2.a + b);  //215
		
	}
}