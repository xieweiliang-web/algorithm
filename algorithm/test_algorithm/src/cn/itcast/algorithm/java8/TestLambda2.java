package cn.itcast.algorithm.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Java中的4大核心函数式接口
 * Consumer<T> 消费型接口 抽象方法：void accept(T)
 * Supplier<T>  供给型接口 抽象方法 T get()
 * Function<T,R> 函数型接口 R apply(T t)
 * Predicate<T> 断言型接口  boolean test(T t)
 */
public class TestLambda2 {
    public static void main(String[] args) {
        String s = changeStr("\t\tmyword", (str) -> str.trim());
        System.out.println(s);
    }

    public static void happy(Double money, Consumer<Double> consumer){
        consumer.accept(money);
    }
    public static List<Integer> getList(int len, Supplier<Integer> supplier){
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<len;i++){
            Integer num = supplier.get();
            nums.add(num);
        }
        return nums;
    }

    public static String changeStr(String str , Function<String,String> function){
        String newStr = function.apply(str);
        return newStr;
    }
}
