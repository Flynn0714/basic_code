package Collections;

        import set.Set_Person;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;

public class collections {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        //使用add方法添加
        arr.add("ffl");
        arr.add("zyl");
        arr.add("qingmi");
        System.out.println(arr);

        //使用Collections.addAll(list,可变参数)添加
        Collections.addAll(arr,"情迷","清明");
        System.out.println(arr);

        //打乱顺序Colles.shuffle()
        Collections.shuffle(arr);
        System.out.println(arr);
        System.out.println("=================================");

        //排序Collections.sort()默认升序，对number排序，也可以对字符串，重写comparable方法
        ArrayList<String> list = new ArrayList<>();
        list.add("ddd");
        list.add("ccc");
        list.add("aaaa");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Set_Person> list1 = new ArrayList<>();
        Set_Person p1 = new Set_Person("情迷",0001);
        Set_Person p2 = new Set_Person("清明",0003);
        Set_Person p3 = new Set_Person("终章",0002);

        //自定义排序
        list1.add(p3);
        list1.add(p2);
        list1.add(p1);
        Collections.sort(list1);
        System.out.println(list1);

        //传比较器排序
        ArrayList<Set_Person> person = new ArrayList<>();
        person.add(p3);
        person.add(p2);
        person.add(p1);
        Collections.sort(person, new Comparator<Set_Person>() {
            @Override
            public int compare(Set_Person o1, Set_Person o2) {
                return o1.getId() - o2.getId(); //升序
            }
        });
        System.out.println(person);
    }
}
