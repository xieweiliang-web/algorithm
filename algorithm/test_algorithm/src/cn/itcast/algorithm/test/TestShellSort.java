package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.ShellSort;

import java.util.Arrays;

/**
 * 测试希尔排序
 */
public class TestShellSort {
    public static void main(String[] args) {
        int[] a={8,7,6,5,4,3,2,1,11};
        ShellSort.sort(a);
        Arrays.stream(a).forEach(System.out::print);
    }
}
