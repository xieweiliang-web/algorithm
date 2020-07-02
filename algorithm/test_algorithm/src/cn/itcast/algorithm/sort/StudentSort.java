package cn.itcast.algorithm.sort;

public class StudentSort implements Comparable<StudentSort>{
    private String name;
    private Integer age;

    public StudentSort() {
    }

    public StudentSort(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentSort{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(StudentSort o) {
        return this.getAge()-o.getAge();
    }
}
