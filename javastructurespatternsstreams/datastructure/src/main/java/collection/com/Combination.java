package collection.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Combination {

    public static int[] next(int[] current, int radix) {
        int[] n= new int[current.length];

        for (int i= n.length; i-- > 0;) {
            if (current[i]+1 == radix)
                n[i]= 0;
            else {
                n[i]= current[i]+1;
                for (; i-- > 0; n[i]= current[i]);
                return n;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int N= 9, M= 3; // values 0, 1, 2, 3 (<N), we want M=3 of them

        int[] a= new int[M];
        int [] arr = new int[]{7,3,10,100,300,200,1000,20,30};
        List<Integer> l = new ArrayList<Integer>();
        do {
            if(arr[a[0]] != arr[a[1]] && arr[a[1]] != arr[a[2]] && arr[a[2]] != arr[a[0]] ){

                int max = max(arr[a[0]],arr[a[1]],arr[a[2]]);
                int min = min(arr[a[0]],arr[a[1]],arr[a[2]]);

                System.out.println(arr[a[0]] + ","+arr[a[1]]+ "," + arr[a[2]] + "  -- "+min + ","+max + " -> " + (max - min));

                l.add(max - min);

            }

        }
        while ((a= next(a, N)) != null);


        int resMin =l.stream().min(Comparator.comparing(Integer::valueOf))
                .get();
        int resMax =l.stream().max(Comparator.comparing(Integer::valueOf))
                .get();


        System.out.println(resMin + "," + resMax);
    }



    public static int max( Integer x, Integer y, Integer z){
        int max = Math.max(x,y);
        if(max>y){ //suppose x is max then compare x with z to find max number
            max = Math.max(x,z);
        }
        else{ //if y is max then compare y with z to find max number
            max = Math.max(y,z);
        }
        return max;
    }
    public static int min( Integer x, Integer y, Integer z){
        int max = Math.min(x,y);
        if(max<y){ //suppose x is max then compare x with z to find max number
            max = Math.min(x,z);
        }
        else{ //if y is max then compare y with z to find max number
            max = Math.min(y,z);
        }
        return max;
    }

}