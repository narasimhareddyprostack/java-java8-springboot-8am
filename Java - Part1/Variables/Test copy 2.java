class Test{
    
    int a = 10;
    int b = 20;
    static int c = 200;
    public static void main(String[] args){
     Test t1 = new Test();
     Test t2 = new Test();
     t2.b=25;
     System.out.println(t1.a+t1.b +Test.c);
     System.out.println(t2.a+t2.b +c);
     System.out.println(t2.a+t2.b +t1.c);
    }
}