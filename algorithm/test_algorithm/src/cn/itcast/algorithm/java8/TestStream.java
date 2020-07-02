package cn.itcast.algorithm.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream的中间操作和终止操作
 */
public class TestStream {
    public static void main(String[] args) {
        List<User> users= Arrays.asList(
                new User("jack",12),
                new User("lily",13),
                new User("ffas",34),
                new User("gag",33)
        );
//        //Stream的中间操作之filter,中间操作不会有结果
//        Stream<User> userStream = users.stream().filter((user) -> user.getAge() > 16);
//        //终止操作才能产生一个结果
//        userStream.forEach(System.out::println);
        //映射操作 map() flatmap()可以把多个流合成一个流
//        users.stream().map(User::getName).forEach(System.out::println);
        //终止操作 allMatch 看是否匹配所有元素 anyMatch 看是否有一个元素匹配的 noneMatch 看是否没有匹配所有元素
//        boolean flat = users.stream().allMatch((x) -> x.getAge() > 10);
//        boolean lily = users.stream().anyMatch((x) -> x.getName().equals("lily"));
//        //终止操作之 findFirst()
////        Optional<User> user = users.stream().sorted((x, y) -> Integer.compare(x.getAge(), y.getAge())).findFirst();
////        System.out.println(user.get());
//        List<Integer> list=Arrays.asList(1,2,3,4,5);
////        Integer sum = list.stream().reduce(0, (x, y) -> x + y);
////        System.out.println(sum);
        //获得年龄之和
//        Optional<Integer> sum = users.stream().map(User::getAge).reduce(Integer::sum);
//        System.out.print(sum.get());
        List<Integer> ages = users.stream().map(User::getAge).collect(Collectors.toList());
        ages.stream().forEach(System.out::println);
        //用collect将数据存到指定集合中
        TreeSet<String> names = users.stream().map(User::getName).collect(Collectors.toCollection(TreeSet::new));


    }

}
