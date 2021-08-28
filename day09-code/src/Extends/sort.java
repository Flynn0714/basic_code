package Extends;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,2,1};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]){
                max = a[i];
            }
        }
        System.out.println(max);
        Arrays.sort(a);
        System.out.println(a[a.length-1]);
    }

}
