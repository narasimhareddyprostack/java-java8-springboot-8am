class Test{
    public static void main(String[] args){
        int[][] arr = {{10,20,30,40},{50,60,70,80,90,100}};
        for(int i =0; i<=arr.length-1; i++){
            for(int j=0;j<=arr[i].length-1; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}

/* for(int[] a :arr){
               for( int b :a){
                   System.out.println(b);
               } 
        } */