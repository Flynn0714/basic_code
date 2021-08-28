package cn.itcast.day04.demo03;

public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(2,3);
        System.out.println("===============");
        method1();
    }
    //两个数字相乘
    public static void method1(int a, int b){
        System.out.println(a*b);
    }
    public static void method1(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello,World!" + i);
        }
    }
}