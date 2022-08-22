//print 1 to 10 , except 7
class Test{
	public static void main(String[] args){
		for(int i=1;i<=10; i++){
			if(i %2 ==0)
				continue;
			System.out.println(i);	
		}
	}
}
//error: break outside switch or loop