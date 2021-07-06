package com.mashibing.dp.abstractfactory;

/*现在工厂*/
public class ModernFactory extends AbstractFactory{

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
