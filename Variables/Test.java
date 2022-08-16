class Test{
    int eid=101;
    String ename ="Rahul Gandhi";

    public void testMethod(){
     System.out.println(eid);
     System.out.println(ename); 
    } 
    public static void main(String[] args){
        Test t =new Test();
        t.testMethod();
    }
}