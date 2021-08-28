package Random;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random r = new Random();
        //随机生成一个数字
        System.out.println("===========================");
        System.out.print(r.nextInt(6) + 1);
    }
}
