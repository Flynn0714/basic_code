package Extends;

public class B {
    public static void main(String[] args) {
        String str1 = "I am Lily";
        String[] array = str1.split(" ");
        String str2 = "";
        for (int i = array.length-1; i >=0 ; i--) {
            str2 += array[i].toUpperCase() +" ";
        }
        System.out.println(str2);
    }
}
