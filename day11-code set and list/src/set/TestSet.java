package set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set_Person p1 = new Set_Person("符方龙",0001);
        Set_Person p2 = new Set_Person("符方龙",0001);
        Set_Person p3 = new Set_Person("符方龙",0002);

        Set<Set_Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
