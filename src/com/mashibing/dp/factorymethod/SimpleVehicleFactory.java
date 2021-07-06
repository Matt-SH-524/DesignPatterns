package com.mashibing.dp.factorymethod;

//简单工厂(Simple Factory)
public class SimpleVehicleFactory {
    //car的生产过程
    public Car createCar() {
        //在这里你可以加权限处理，日志过程
        return new Car();
    }
    public Broom creatBroom() {
        return new Broom();
    }
    public Plane creatPlane() {
        return  new Plane();
    }
}
