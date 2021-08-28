package Extends;

import java.util.Arrays;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        Random random = new Random();
        int count = 0;
        boolean flag = true;
        while (count<10){
            int num = random.nextInt(1001);
            if (num % 3 == 0 ){
                for(int j = 0;j<arr.length;j++){
                    if (num == arr[j]){
                        flag = false;
                    }
                }
                if (flag==true){
                    arr[count] = num;
                    count++;
                }else{
                    flag = true;
                }

            }
        }
        System.out.println("=====");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" " );
        }
    }
}
