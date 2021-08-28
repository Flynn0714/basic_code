package cn.itcast.day05.demo3;

public class ReturnArray {
    public static void main(String[] args) {
        int[] array = {12,3,4,5,6};
        System.out.println("array数组最大值为:" + Array_Return(array)[1] + "  最小值为:" + Array_Return(array)[0]);
    }

    //返回值为数组的函数
    private static int[] Array_Return(int[] array){
        //result数组第一个数表示最小值，第二个数表示最大值
        int[] result = {array[0],array[0]};
        for (int i = 0; i < array.length; i++) {
            if (result[0] > array[i]){
                result[0] = array[i];
            }
            if (result[1] < array[i]){
                result[1] = array[i];
            }
        }
        return result;
    }
}