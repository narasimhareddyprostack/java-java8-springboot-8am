class Test{
	public static void main(String[] args){
		//Declaration;
		int[] a;
		//creation
		a = new int[4];
		//initilization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]); //default value
		System.out.println(a[100]); //AIOBE
	}
}