package codility;

import java.util.Arrays;
import java.util.List;

public class CountDiv {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        l.stream().filter(n -> n.equals(2)).forEach(System.out::println);
    }
}
