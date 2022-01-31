package org.yuyuan;

import java.util.function.Supplier;

public class Foo<T extends Car> implements Supplier<T> {
    @Override
    public T get() {
        return null;
//        T obj = new T();
//        System.out.println(obj.getClass().toGenericString());
//        return obj;
    }
}
