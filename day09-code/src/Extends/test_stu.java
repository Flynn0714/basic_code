package Extends;

public class test_stu {
    public static void main(String[] args) {
        student stu = new student();
        System.out.println(stu.age); //优先使用当前对象类里面的同名成员变量 age = 18
        stu.sleep();

        System.out.println("==========");
        person one = new person();
        System.out.println(one.age);
        one.sleep();

    }
}
