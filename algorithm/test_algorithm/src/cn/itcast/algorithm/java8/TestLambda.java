package cn.itcast.algorithm.java8;

import sun.rmi.server.UnicastServerRef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List<User> users= Arrays.asList(
                new User("jack",12),
                new User("lily",13),
                new User("ffas",34),
                new User("gag",33)
        );
//        //匿名内部类
//        List<User> userList=getUesrOlderThan13(users, new MyPredicate<User>() {
//            @Override
//            public boolean isBigger(User user) {
//                return user.getAge()>13;
//            }
//        });
//        for (User user : userList) {
//            System.out.println(user);
//        }
//        //使用lambda表达式
//        List<User> userList=getUesrOlderThan13(users,(x)->x.getAge()>13);
//        userList.forEach(System.out::println);
        //使用流处理
        users.stream().filter((user)->user.getAge()>13).forEach(System.out::println);
    }

    /**
     * 传统方式获得年龄过13岁的user
     * @param users
     * @return
     */
    public static List<User> getUserOlderThan13(List<User> users){
        List<User> newUsers=new ArrayList<>();
        for(User user: users){
            if(user.getAge()>13){
                newUsers.add(user);
            }
        }
        return newUsers;
    }

    /**
     * 行为参数化
     */
    public static List<User> getUesrOlderThan13(List<User> users,MyPredicate<User> predicate){
        List<User> newUsers=new ArrayList<>();
        for(User user: users){
            if(predicate.isBigger(user)){
                newUsers.add(user);
            }
        }
        return newUsers;
    }

}
