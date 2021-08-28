package List;

import java.util.LinkedList;

/*
    1.LinkedList、ArrayList是List的两个实现类
    2.LinkedList用链表实现，特点查询慢，增删块   ArrayList是数组实现，特点是查询快，增删慢
    3.LinkedList提供了大量操作链表头尾的方法 不能使用多态
*/
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("ffl");
        linkedList.add("zyl");
        System.out.println(linkedList);

        linkedList.add(1,"love"); //指定索引位置插入数据
        System.out.println(linkedList);
    }
}
