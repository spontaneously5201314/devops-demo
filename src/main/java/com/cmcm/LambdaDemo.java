package com.cmcm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Spontaneously
 * @time 2018-10-09 上午10:22
 */
public class LambdaDemo {

    public static void main(String[] args) {
        List<Integer> naturals = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        naturals.stream()
                .map(n -> n * 2)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
