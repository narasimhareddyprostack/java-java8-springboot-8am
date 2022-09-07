class Test{
    public static void main(String[] args){
        try{
             //String s = null;
             //System.out.println(s.length());
             throw new NullPointerException("Rajni Kanth");
        }
        catch(NullPointerException e){
            e.printStackTrace();
            //System.out.println(e);
        }
    }
}