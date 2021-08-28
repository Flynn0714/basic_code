package String;

public class string_zhuanhuan {
    public static void main(String[] args) {
        //字符串转字符数组方法toCharArray()；
        String str = "abc";
        char[] char_array = str.toCharArray();
        for (int i = 0; i < char_array.length; i++) {
            System.out.print(char_array[i] + " ");
        }
        System.out.println();
        System.out.println("==================");

        //获取当前字符串拆分为字符数组作为返回值。
        byte[] byte_array = str.getBytes();
        for (int i = 0; i < byte_array.length; i++) {
            System.out.print(byte_array[i] + " ");
        }
        System.out.println();
        System.out.println("==================");

        //字符替代方法
        String str1 = "你大爷的！你大爷的！";
        String str2 = str1.replace("大爷的","***");
        System.out.println(str2);
    }
}
