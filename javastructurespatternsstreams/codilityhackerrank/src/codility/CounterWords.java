package codility;

import java.util.HashMap;

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
