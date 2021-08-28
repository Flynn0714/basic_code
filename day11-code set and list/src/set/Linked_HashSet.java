package set;

import java.util.*;

public class Linked_HashSet {
    public static void main(String[] args) {
        //LinkedHashSet 有序 解构：哈希表+链表，多了一条链表
        //无序
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("ffl");
        System.out.println(set);

        //有序
        LinkedHashSet<String> lset = new LinkedHashSet<>();
        lset.add("www");
        lset.add("abc");
        lset.add("ffl");
        System.out.println(lset);
    }
}
