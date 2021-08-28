package cn.itcast.day06.ClassAndObject;
/*
    定义一个学生类
    成员变量：直接定义在类当中的，在方法外边
    成员方法：不要写static关键字。
*/
public class Student {
    // 成员变量
    public String name = "ffl"; //姓名
    public int age = 21;     //年龄


    //成员方法
    public void eat(){
        /*吃饭*/
        System.out.println("吃饭饭！！");
    }

    public void sleep(){
        /*睡觉*/
        System.out.println("睡觉觉！！");
    }

    public void study(){
        /*学习*/
        System.out.println("学习呢！！");
    }
}
