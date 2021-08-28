package Scanner;
import java.util.Scanner;

public class AddScanner {
    //从键盘输入两个数相加
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        System.out.println(a+b);
    }
}
