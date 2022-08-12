class Test{
	public static void main(String[] args){
		String[] names;
		names = new String[3];
		names[0] = "Rahul Gandhi";
		names[1] = "Sonia";

		System.out.println(names[0]); // Rahul
		System.out.println(names[1]); //Sonia
		System.out.println(names[2]); //null
		//System.out.println(names[3]); //AIOBE
	}
}