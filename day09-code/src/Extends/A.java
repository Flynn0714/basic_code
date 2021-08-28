package Extends;
import java.util.Date;
import java.text.SimpleDateFormat;

public class A {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String time = sdf.format(date);
        System.out.println(time);
    }
}
