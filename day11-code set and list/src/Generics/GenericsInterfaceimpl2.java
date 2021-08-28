package Generics;

public class GenericsInterfaceimpl2<I> implements GenericInterface<I> {
    //接口的实现类也是泛型
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
