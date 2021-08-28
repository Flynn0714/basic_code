package Generics;

public class Demo01GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
        System.out.println("这是一个泛型类 " + name);
    }
}
