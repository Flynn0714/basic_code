package Generics;

public class testGenerics {
    public static void main(String[] args) {
        //GenericsClass不是一个泛型类
        GenericClass gc1 = new GenericClass();
        gc1.setName("Flynn");

        Demo01GenericClass<Integer> gc2 = new Demo01GenericClass<Integer>();
        gc2.setName(1); //自动装箱

        Demo01GenericClass<String> gc3 = new Demo01GenericClass<String>();
        gc3.setName("符方龙");
        System.out.println("=======================================");
        GenericsMethod gc4 = new GenericsMethod();
        gc4.methods("string");
        gc4.methods(1);
        System.out.println("=======================================");

        //泛型接口 -- 实现类为String
        GenericInterfaceimpl1 gc5 = new GenericInterfaceimpl1();
        gc5.method("小猪猪");
        //实现类为泛型
        GenericsInterfaceimpl2 gc6 = new GenericsInterfaceimpl2();
        gc6.method(1);
        gc6.method('c');
        gc6.method("string");
    }
}
