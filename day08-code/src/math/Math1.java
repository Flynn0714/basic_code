package math;
        import java.lang.Math;
public class Math1 {
    public static void main(String[] args) {
        int a = -1;
        double A,B,C;
        A = 59.4;
        B = 59.6;
        C = 59.5;
        System.out.println(a + " 的绝对值："+ Math.abs(a));
        System.out.println(A + " 向上取整:" + Math.ceil(A));
        System.out.println(B + " 向下取整:" + Math.floor(A));
        System.out.println(C + " 四舍五入:" + Math.round(C));
    }
}
