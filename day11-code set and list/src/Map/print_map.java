package Map;

import java.util.*;

public class print_map {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("zyl","001");
        map.put("ffl","002");
        map.put("zjh","003");
        System.out.println(map);

        //打印m1
        //迭代器
        Set<String> Str_Key = new HashSet<>();
        Str_Key = map.keySet();
        System.out.println(Str_Key);
        for(String str : Str_Key){
            System.out.println(str + "=" + map.get(str));
        }
        System.out.println("-------------------");
        //迭代器
//        Iterator it = Str_Key.iterator();
//        while (it.hasNext()){
//            String key = (String) it.next();
//            String value = map.get(key);
//            System.out.println(it.next() + "=" + value);
//        }

        //Entry对象
        Set<Map.Entry<String,String>> set = map.entrySet();
        System.out.println(set);
        System.out.println("=======================");
        Iterator<Map.Entry<String,String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("----------------");
        for (Map.Entry<String,String> entry : set){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
