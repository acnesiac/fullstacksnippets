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

        int N= 4, M= 2; // values 0, 1, 2, 3 (<N), we want M=3 of them

        int[] a= new int[M];
        int [] arr = new int[]{1,4,7,2};
        List<Integer> l = new ArrayList<Integer>();
        do {
            if(arr[a[0]] != arr[a[1]]){
                //System.out.println(Arrays.toString(a));
                //System.out.println(arr[a[0]] + ","+arr[a[1]]);
                int max = max(arr[a[0]],arr[a[1]]);
                int min = min(arr[a[0]],arr[a[1]]);
                System.out.println(min + ","+max + " -> " + (max - min));

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



    public static int max( Integer a, Integer b){
        return  a.intValue() > b.intValue() ? a.intValue() : b.intValue();
    }
    public static int min( Integer a, Integer b){
        return  a.intValue() < b.intValue() ? a.intValue() : b.intValue();
    }

}