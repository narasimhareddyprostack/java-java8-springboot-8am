interface Registration{
    public abstract boolean saveCustomer();
}
interface Login{
    public abstract boolean loginCustomer();
}

class RegistrationImpl implements Registration,Login{
    public boolean saveCustomer(){
        //business logic
        return true;
    }
    public boolean loginCustomer(){
        return true;
    }
    public static void main(String[] args){
        RegistrationImpl r = new RegistrationImpl();
        
        System.out.println(r.saveCustomer());
        System.out.println(r.loginCustomer());
       
    }
} 