package Abstract;

public class test{
    public static void main(String[] args) {
        String str1 = "alpha_Beta_double";
        String[] str2 = str1.split("_");
        String result = "";
        for (int i = 0; i < str2.length; i++) {
            result += str2[i].substring(0,1).toUpperCase() + str2[i].substring(1);
        }
        System.out.println(result);
    }
}