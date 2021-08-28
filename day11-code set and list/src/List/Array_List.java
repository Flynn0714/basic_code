package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    1.有序集合
    2.有索引（特有方法）
    3.允许存储重复的数据
*/
public class Array_List {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>(); //多态 List接口 List集合的实现类ArrayList
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        list.add("a");
        list.add("ab");
        System.out.println(list);

        //指定位置增加元素
        list.add(3,"符方龙");
        System.out.println(list); //536514974

        //删除指定位置的元素
        list.remove(5);
        System.out.println(list);

        //替换指定位置的元素
        list.set(5,"朱燕玲");
        System.out.println(list);

        //获取指定索引位置元素
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        //迭代器
        System.out.println();
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

        //使用增强for循环
        System.out.println();
        for(String s : list){
            System.out.print(s + " ");
        }

    }
}
