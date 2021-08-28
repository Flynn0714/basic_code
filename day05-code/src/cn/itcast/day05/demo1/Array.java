package cn.itcast.day05.demo1;

public class Array {
    public static void main(String[] args){
        int[] array = {10,20,30};
        System.out.println(array); //得到数组内存地址的哈希值
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
    }
}
