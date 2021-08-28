package cn.itcast.day06.UseClass;
import cn.itcast.day06.ClassAndObject.Student;
/*
   1. 导包 import 包名称.类名称
   2. 创建
   3. 使用
*/
public class StuObject {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.eat();
        stu.sleep();
        stu.study();
        stu.name = "小艾";
        System.out.println(stu.name);
    }
}
