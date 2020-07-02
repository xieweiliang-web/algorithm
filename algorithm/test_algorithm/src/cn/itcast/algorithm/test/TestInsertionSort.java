package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.InsertionSort;

import java.util.Arrays;

/**
 * 测试插入排序
 */
public class TestInsertionSort {
    public static void main(String[] args) {
        int[] a={7,6,5,4,3,2};
        InsertionSort.sort(a);
        Arrays.stream(a).forEach(System.out::print);
    }
}
