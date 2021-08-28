package set;
//可变参数
public class variable_argument {
    public static void main(String[] args) {
        Set_Person p = new Set_Person("ffl",1232);
        sum(1,2,3,4,5);
        sum1("qingmi",'A',1,2,3);
        sum2("情迷",'A',1,2.7,p);
    }

    public static void sum(int...nums){
        //nums类型是一个数组
        //与参数是个数组相比，传入的是不确定数量的整数，参数为数组的话传入的参数是确定的数组
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        System.out.println(sum);
    }

    //注意：1.一个方法只能有一个可变参数
    //public static void sum1(int...array1,String...str){} 报错
    //2.如果有多个参数，可变参数只能放最后
    public static void sum1(String num,char chr,int...array1){
        System.out.println(num + chr);
        System.out.println(array1);
    }
    public static void sum2(Object...array1){
        for(Object item : array1){
            System.out.println(item);
        }
    }

}
