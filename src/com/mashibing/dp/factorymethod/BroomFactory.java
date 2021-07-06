package com.mashibing.dp.factorymethod;

//工厂方法：对每种产品都做一种工厂方法
public class BroomFactory {
    public  Moveable create() {
        System.out.println("a broom created!");
        return new Broom();
    }
}
