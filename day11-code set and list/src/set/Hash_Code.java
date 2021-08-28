package set;
    //HashCode 对象的逻辑地址值
public class Hash_Code {
    public static void main(String[] args) {
        String[] str = {"符方龙","情迷"};
        System.out.println(Integer.toHexString(str.hashCode())); //hashcode值转16进制
        System.out.println(str);
    }
}
