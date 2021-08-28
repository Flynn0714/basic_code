package cn.itcast.day04.demo02;
/*
方法就是若干语句的集合
修饰符：public static\
方法名称
返回值类型
参数名称
方法体
返回值：与返回值类型保持一致

*/
public class Demo02MethodDefine {
    public static void main(String[] args){
        System.out.println(sum(1,2));
        System.out.println(sum(3.4,2.0));
    }
    public static int sum(int a,int b){
        return a + b;
    }
    public static double sum(double a,double b){
        return a + b;
    }
}
