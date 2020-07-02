package cn.itcast.algorithm.java8;

public class FilterUser implements MyPredicate<User> {

    @Override
    public boolean isBigger(User user) {
        return user.getAge()>13;
    }
}
