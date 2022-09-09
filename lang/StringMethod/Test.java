class Test{
    public static void main(String[] args){
        String ename = "Rahul Gandhi";
        ename=ename.concat("Indian Politician");

        System.out.println("String Length :"+ename.length());
        System.out.println("Char At :" + ename.charAt(10));
        System.out.println("Sub String:" + ename.substring(6,12));
        System.out.println("Is Empty or Not:" + ename.isEmpty());
        System.out.println("Index of 'G':" + ename.indexOf('G'));
    }
}