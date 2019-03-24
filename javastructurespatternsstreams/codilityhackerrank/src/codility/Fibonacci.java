package codility;

public class Fibonacci {
    public static void main(String args[]){
        //0112358
        System.out.println( new Fibonacci().fibo(6) );
    }

 public int fibo(int i){
     if( i == 0 ){
         return 0;
     }else
     if( i == 1 ){
         return 1;
     }
     else {
         return ( fibo(i -1) + fibo(i-2) );
     }
 }
}
