package cn.itcast.day05.demo3;

public class ArrayMax {
    public static void main(String[] args) {
        int[] array = new int[] {2,3,5,6,7,8,43,76,23,9,10};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

    }
}
