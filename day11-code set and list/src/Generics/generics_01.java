package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class generics_01 {
    public static void main(String[] args) {
        show();
        show01();
    }
    public static void  show(){
        //使用泛型
        ArrayList<String> list = new ArrayList<>();
        list.add("情迷");
        list.add("1");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s + "-->" + it.next());
        }
    }
    private static void show01(){
        //创建集合对象，不使用泛型
        //好处，可以使用object对象，存储任意类型数据 坏处：不安全
        ArrayList list = new ArrayList();
        list.add("符方龙");
        list.add(1);

        //如何访问集合
        //取集合迭代器
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            //想要使用string中特有的方法去计算集合中每个元素的长度，向下转型
//            String s = (String)iter.next();
//            System.out.println(s.length());
        }
    }
}
