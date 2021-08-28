package String;
/*
创建字符串的3+1种方式
1. 三种构造方法：
    public String(); 内容为空
    public String(char[] array);
    public String(byte[] array);
2. 一种直接创建：
*/
public class string {
    public static void main(String[] args) {
        //使用空构造
        String str1 = new String();
        System.out.println(str1); //为空
        System.out.println("==============");

        //根据字符数组创建字符串
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println(str2);
        System.out.println("==============");

        //根据字节数组创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println(str3);
        System.out.println("==============");

        //直接创建字符串
        String str4 = "ffl";
        System.out.println(str4);
    }
}
