import java.io.*;
class Test{
    public static void main(String[] args){
        try{
            PrintWriter  pw = new PrintWriter("abc.txt");
            pw.println("Hello,GM");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}