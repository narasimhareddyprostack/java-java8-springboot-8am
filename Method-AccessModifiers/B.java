package pack2;
import pack1.A;
class B{
    public static void main(String[] args){
        A a  = new A();
        a.m1(); // m1 method is public 
        //a.m2(); 
        //a.m3(); m3() method private, we cant access
       
    }
}