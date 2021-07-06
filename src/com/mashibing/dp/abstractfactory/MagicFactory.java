package com.mashibing.dp.abstractfactory;

/*魔法世界的工厂*/
public class MagicFactory extends AbstractFactory{

    @Override
    Food createFood() {
        return new Mashroom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }
}
