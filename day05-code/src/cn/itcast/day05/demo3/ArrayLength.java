package cn.itcast.day05.demo3;

public class ArrayLength {
    public static void main(String[] args) {
        //所有的引用类型都可以赋值为null。
        int[] array;
        array = new int[3];
        int len = array.length;
        System.out.println(len);

        int[] arrayA = {12,3,12,4,15,6,6,7,7,8,8,9,4,7,89,9,0};
        System.out.println(arrayA.length);
    }
}
