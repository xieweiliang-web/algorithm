package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.StudentSort;

/**
 * 对实现了Comparable接口的两个StudentSort类，选出大的那个
 */
public class TestComparable {
    public static void main(String[] args) {
        StudentSort s1 = new StudentSort("s1", 11);
        StudentSort s2 = new StudentSort("s2", 22);
        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable s1,Comparable s2){
        return s1.compareTo(s2)>0?s1:s2;
    }
}
