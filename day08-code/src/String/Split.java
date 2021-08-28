package String;
/*
Split方法括号中使用的是正则表达式
当时存在英文句点时无法分割，应加上\\
*/
public class Split {
    public static void main(String[] args) {
        String str = "AAA BBB CCC";
        String str1 = "aaa,bbb,ccc";
        String str2 = "XXX.YYY.ZZZ";
        arrayPrint(str.split(" "));
        arrayPrint(str1.split(","));
        arrayPrint(str2.split("\\."));
    }
    public static void arrayPrint(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
