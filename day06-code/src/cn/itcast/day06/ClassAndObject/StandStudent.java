package cn.itcast.day06.ClassAndObject;
//标准的学生类
public class StandStudent {
    private String  name;
    private int age;

    public String getName() {
        return name;
    }

    public StandStudent() {
    }

    public StandStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
