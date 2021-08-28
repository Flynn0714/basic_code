package cn.itcast.day06.ClassAndObject;

public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我是"+ name +",年龄" + age);
    }
    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
}
