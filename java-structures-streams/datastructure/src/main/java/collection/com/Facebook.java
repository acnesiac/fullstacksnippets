package collection.com;

public class Facebook {
    public static void main(String[] args){
        int []arr  = new int []{1,2,4,7};

        for (int  i = 0 ; i< 4 ; i++){
            for (int j  = 0 ; j < 4 ; j ++){
                if(i != j){
                    System.out.println(" " + arr[i] + "," + arr[j] );

                }
            }
        }
    }
}
