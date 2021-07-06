package com.mashibing.dp.factorymethod;

//工厂方法：对每种产品都做一种工厂方法
public class PlaneFactory {
    public  Moveable create() {
        System.out.println("a plane created!");
        return new Plane();
    }
}
