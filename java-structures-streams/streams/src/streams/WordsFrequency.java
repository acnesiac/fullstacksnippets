package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsFrequency {
    public static void main(String[] args) {
        functionmine();
    }

    private static void functionmine() {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        List<String> l = Arrays.asList("s", "s", "a", "a");
        for (String a : l
        ) {
            if (!hm.containsKey(a)) {
                hm.put(a, 1);
            } else {
                Integer i = hm.get(a);
                ++i;
                hm.put(a, i);
            }
        }

        hm.entrySet().stream()
                .map(Map.Entry::getValue)
                .forEach(
                        System.out::println
                );
    }
}
