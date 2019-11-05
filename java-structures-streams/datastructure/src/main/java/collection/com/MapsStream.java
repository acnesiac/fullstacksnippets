package collection.com;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapsStream {
    public static void main(String[] args){
        //IntStream.of(1,2,3,4,5,6,6).map(n -> n *2).forEach(System.out::print);
        IntStream.of(2,3,4,5,6,7,7).max();
        IntStream.of(3,2,3,4,5,5,6).boxed().collect(Collectors.toList());

        List<String> listDays = Arrays.asList("1","2","3");
        //listDays.forEach(System.out::print);


        char[] arr = "111122".toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i =0 ;  i< arr.length ; i++){
            if( !hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else{
                int n = hm.get(arr[i]);
                n++;
                hm.put(arr[i],n);
            }


        }




    }


}
