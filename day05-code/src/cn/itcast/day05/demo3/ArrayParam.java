package cn.itcast.day05.demo3;

public class ArrayParam {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,0};
        ArrayPrint(array);
    }

    //数组打印函数
    public static void ArrayPrint(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
