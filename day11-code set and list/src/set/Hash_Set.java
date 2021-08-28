package set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
    set接口：和借口list一样 extends Collection借口
    1、不可重复
    2、无索引
    3、两个实现类
*/
public class Hash_Set {
    //底层是哈希表--速度快
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);  //添加失败，但不报错，去重
        System.out.println(hashSet);

        //遍历，迭代器、增强for循环
        System.out.println();
        for(Integer i : hashSet){
            System.out.print(i + " ");
        }

        System.out.println();
        Iterator it = hashSet.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
