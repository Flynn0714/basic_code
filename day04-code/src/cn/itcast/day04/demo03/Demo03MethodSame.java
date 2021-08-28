package cn.itcast.day04.demo03;

public class Demo03MethodSame {
    public static void main(String[] args) {
        System.out.println(NumSame(1,12));
        leijia();
    }


    public static boolean NumSame(int a, int b){
        System.out.println("相同数字判断函数");
        if(a == b) {
            return true;
        }else {
            return false;
        }
    }

    public static void leijia(){
        System.out.println("累加函数");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
