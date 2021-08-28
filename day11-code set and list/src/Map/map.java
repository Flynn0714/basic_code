package Map;

import java.util.HashMap;
import java.util.Map;

/*
    map集合的特点、；
    1、map集合是一个双列集合，包含key和value
    2、map中的元素key和value的数据；类型可以相同
    3、map中的元素，key是不可以重复的，但是value可以
    4.key与value的关系是一一对应的

    HashMap与LinkedMap集合
    HashMap结构是哈希表+单向链表 --无序
    LinkedMap是哈希表+链表  --有序
*/
public class map {
    public static void main(String[] args) {
        show01();
    }
    public static void show01(){
        //创建map对象
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("符方龙","朱燕玲");
        System.out.println("v1：" + v1);  //没有相同键 返回null
        String v2 = map.put("符方龙","朱燕玲1");
        System.out.println("v2：" + v2);  //有相同键 返回被替换的值
        System.out.println(map);

        map.put("冷锋","龙小云");
        map.put("李晨","范冰冰");
        map.put("情迷","清明");
        System.out.println(map);

        String v = map.remove("符方龙");
        System.out.println(v);  //返回被删除的值，没有则返回空
        System.out.println(map);

        String str = map.get("符方龙");
        System.out.println(str);  //有则返回对应的value，无则返回NULL

        Boolean str1 = map.containsKey("符方龙");
        Boolean str2 = map.containsValue("龙小云");
        System.out.println(str1);
        System.out.println(str2);

    }
}

