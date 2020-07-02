package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.SelectionSort;

import java.util.Arrays;

public class TestSelectionSort {
    public static void main(String[] args) {
        int[] a={1,9,5,3,7,5};
        SelectionSort.sort(a);
        Arrays.stream(a).forEach(System.out::print);
    }
}
