package codility;

public class ReverseStrin {
    public static void main (String args[]){
        char[] arr = new char[]{'a','b', 'c','d'};
        char[] res = new char[arr.length];
        int i = 0;
        while(i < arr.length ){
            res[ arr.length-i -1 ] = arr[i];
            i++;
        }

        System.out.println(res);

    }
}
