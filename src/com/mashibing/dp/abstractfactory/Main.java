package com.mashibing.dp.abstractfactory;

public class Main {
    public static void main(String[] args) {
        //模拟了现代人的3种产品
        AbstractFactory f = new ModernFactory();
        //汽车
        Vehicle c = f.createVehicle();
        c.go();
        //开着枪
        Weapon ak = f.createWeapon();
        ak.shoot();
        //吃面包
        Food b = f.createFood();
        b.printName();

        //模拟魔法世界的3种产品
        AbstractFactory MagicF = new MagicFactory();

    }
}
