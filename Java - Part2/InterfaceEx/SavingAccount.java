interface Account{
    int min_Bal=500;
}
class AccountImpl implements Account{
    public static void main(String[] args){
        System.out.println(min_Bal);
    }
}