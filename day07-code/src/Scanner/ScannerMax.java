package Scanner;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < 3; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
