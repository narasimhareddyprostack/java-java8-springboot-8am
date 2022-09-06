interface Account{
    void m1();
    void m2();
}
class AccountImpl implements Account{
    public void m1(){
        System.out.println("m1 method");
    }
    public void m2(){
        System.out.println("m2 method");
    }
    public static void main(String[] args){
        AccountImpl a = new AccountImpl();
        a.m1();
        a.m2();
    }
}