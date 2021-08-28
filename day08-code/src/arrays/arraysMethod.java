package arrays;

import java.util.Arrays;

public class arraysMethod {
    public static void main(String[] args) {
        int[] array1 = {10,20,30};
        //将数组按照默认格式转为字符串[元素1，元素2.，元素3]
        System.out.println(Arrays.toString(array1));
        System.out.println("=====================");

        //数组排序
        int[] array2 = {5,2,6,8,3,7};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        String[] array3 = {"aaa","ccc","bbb"};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
    }
}
