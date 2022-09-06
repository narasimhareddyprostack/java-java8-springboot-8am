package pack3;
import pack1.A;
class D extends A{
    public static void main(String[] args){
        //A a  = new A();
        //a.m1(); // m1 method is public 
        
       // D d = new A();
       //d.m4();  //m4 protected acces
        D obj = new D();
        obj.m4(); //m4 is protected acces
    }
}