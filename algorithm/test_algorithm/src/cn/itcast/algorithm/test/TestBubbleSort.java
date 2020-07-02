package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.BubbleSort;

import java.util.Arrays;

/**
 * 传入数组，用BubbleSort进行排序
 */
public class TestBubbleSort {
    public static void main(String[] args) {
        Integer[] a={4,6,1,3,9};
        BubbleSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
