package String;

public class CharSum {
    public static void main(String[] args) {
        String str = "FASFQfsugibfkB 1-0-";
        char[] chararray = str.toCharArray();
        for (int i = 0; i < chararray.length; i++) {
            int sum = 0;
            for (int j = 0; j <chararray.length ; j++) {
                if (chararray[i] == chararray[j]) {
                    sum ++;
                }
            }
            System.out.println(chararray[i] + "：" + sum );
        }
    }
}
