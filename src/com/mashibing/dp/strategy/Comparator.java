package com.mashibing.dp.strategy;

public interface Comparator<T> {
    int compare(T o1,T o2);

    //JDK1.8以前是写不了方法的，现在可以在Interface里写方法了。
    //为什么是default方法？接口里只能有一个abstract方法
    default void m() {
        System.out.println("m");
    }
}
