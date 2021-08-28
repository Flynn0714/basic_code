package Abstract;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = new int[6];
        //方法1
        System.arraycopy(a,0,b,0,a.length);
        System.out.println(Arrays.toString(b));
        //方法2：
        b = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(b));
    }
}
