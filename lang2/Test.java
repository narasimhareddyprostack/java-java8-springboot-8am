class Employee{
    Employee(){

    }
}
class Test{
   public static void main(String[] args){
      Employee e1 = new Employee();
      Employee e2 = new Employee();
     // System.out.println(e1.equals(e2)); 
      //System.out.println(e1 == e2); 
    
      String s1 = "Rahul";
      String s2 = "Rahul";

      //System.out.println(s1.equals(s2)); 
      //System.out.println(s1==s2); 

      String s3 = new String("Sonia");
      String s4 = new String("Sonia");
      
      System.out.println(s3.equals(s4)); 
      System.out.println(s3==s4); 
      
      int a = 10;
      int b = 10;
      //System.out.println(a.equals(b));//equals() method applicable for only object
      //System.out.println(a == b);     true

    }
}