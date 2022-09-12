class Employee{
    Employee(String name){}
    public static void main(String[] args){
        Employee e1 = new Employee("Rahul");
        Employee e2 = new Employee("Rahul");
        System.out.println(e1.equals(e2)); //false

        String s1 ="Rahul";
        String s2 ="Rahul";
        
        System.out.println(s1.equals(s2));  //true
        
    }
}