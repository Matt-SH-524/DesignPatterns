package com.mashibing.dp.abstractfactory;

//抽象的工厂可以生产抽象的产品
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Weapon createWeapon();
    abstract Vehicle createVehicle();
}
