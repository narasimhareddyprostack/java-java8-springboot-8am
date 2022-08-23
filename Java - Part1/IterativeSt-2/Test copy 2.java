class Test{
    public static void main(String[] args){
        int[] marks = {35,36,37,38,39,40};
        //read array values using while 
        //inilitzation : int i=0;
        //condition    : i<=5 // i<=marks.length-1 // i<marks.length
        //incr/decr    : i++
        int i=0;
        while(i<=marks.length-1){
            System.out.println(marks[i]);
            i++;
        }
    }
}