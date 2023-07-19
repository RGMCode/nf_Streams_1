package com.rgmcode.nf_streams_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    @Test
    public void streamArrayTest() {
        int[] zahlen = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};
        String array = Arrays.toString(
                Arrays.stream(zahlen)
                        .sorted()
                        .toArray()
        );
        System.out.println(array);
    }

    @Test
    public void streamListTest() {
        int[] zahlen = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};
        List<Integer> list = Arrays.stream(zahlen)
                .sorted()
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list);
    }

    @Test
    public void sumTest() {
        int[] zahlen = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};
        int summe = Arrays.stream(zahlen).sum();
        System.out.println(summe);
    }

    @Test
    public void reduce() {
        int[] zahlen = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};
        int produkt = Arrays.stream(zahlen)
                .reduce(1, (a, b) -> a * b);
        System.out.println(produkt);
    }

}