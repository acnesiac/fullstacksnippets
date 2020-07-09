package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1);
        Stream<Integer> stream = integers.stream().filter((value) -> (value == 1));
        stream.forEach(integer -> System.out.println(integer));
    }
}
