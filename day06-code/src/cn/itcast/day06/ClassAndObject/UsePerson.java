package cn.itcast.day06.ClassAndObject;

public class UsePerson {
    public static void main(String[] args) {
        Person one = new Person();
        one.show();

        one.name = "赵小🔪";
        one.setAge(19);
        one.show();
    }
}
