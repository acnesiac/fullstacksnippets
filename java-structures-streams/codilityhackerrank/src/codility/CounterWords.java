package codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CounterWords {
    public static void main(String[] args){
        new CounterWords().count();
    }
    public HashMap<String, Integer> count(){
        String str[ ] = new String[]{"a","b","a", "a","b"};
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        for(int i= 0 ; i < str.length ; i ++){
            if(!hm.containsKey(str[i])){
                hm.put(str[i],1);

            }
            else{
                String s =str[i];
                int val= hm.get(s);
                hm.put(str[i], ++val );
            }
        }

        return hm;
    }
}
//
//
//package codility;
//
//        import java.util.Arrays;
//        import java.util.HashMap;
//        import java.util.List;
//        import java.util.Map;
//
//public class WordsFrecuency {
//    public static void main(String[] args) {
//        functionmine();
//    }
//
//    private static void functionmine() {
//        HashMap<String, Integer> hm = new HashMap<String, Integer>();
//        List<String> l = Arrays.asList("s", "s", "a", "a");
//        for (String a : l
//        ) {
//            if (!hm.containsKey(a)) {
//                hm.put(a, 1);
//            } else {
//                Integer i = hm.get(a);
//                ++i;
//                hm.put(a, i);
//            }
//        }
//
//        hm.entrySet().stream()
//                .map(Map.Entry::getValue)
//                .forEach(
//                        System.out::println
//                );
//    }
//}
