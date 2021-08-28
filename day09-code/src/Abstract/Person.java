package Abstract;

public class Person {
    private String name = null;
    private int health = 0;
    private String sex = null;
    public void Person(){
        this.health = 10;
        this.sex = "雄";
        System.out.println("执行构造函数");
    }
    public void print (){
        System.out.println(name);
        System.out.println(health);
        System.out.println(sex);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.print();
    }
}
