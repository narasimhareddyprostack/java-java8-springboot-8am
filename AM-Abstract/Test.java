abstract class A{
//error: A is abstract; cannot be instantiated    
//we cannt create object for abstract classes
}

class Test{
    public static void main(String[] args){
        A a = new A();// For abstract classes we cant create object
    }
}

