package ArrayList;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("情迷");
        list.add("终章");
        list.add("世子");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==================");
        System.out.println(list.remove(2));
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
