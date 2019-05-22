package codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordsFrecuency {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        List<String> l = Arrays.asList("s","s","a","a");
        for (String a : l
             ) {
            if (!hm.containsKey(a)){
                hm.put(a,1);
            }else{
                Integer i = hm.get(a);
                ++i;
                hm.put(a,i);
            }
        }



       hm.keySet().stream().sorted((a,b)-> { return b.compareTo(a); }).forEach(
               (v)->System.out.println( " Count : " + v)
       );
    }
}
