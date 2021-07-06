package com.mashibing.dp.factorymethod;

//工厂方法：对每种产品都做一种工厂方法
public class CarFactory {
    public  Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}
