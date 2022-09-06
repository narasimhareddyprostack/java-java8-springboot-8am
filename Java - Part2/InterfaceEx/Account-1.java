interface Account{
    // public abstract double getBal();
    // public abstract String getName();
                       boolean transfer();
    //100 % abstract methdos
}
class AccountImpl implements Account{
    public boolean transfer(){
        return false;
    }
    public static void main(String[] args){
       AccountImpl a1= new AccountImpl();
       System.out.println(a1.transfer()); 
    }
}