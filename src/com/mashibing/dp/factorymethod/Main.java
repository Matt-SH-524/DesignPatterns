package com.mashibing.dp.factorymethod;

import com.mashibing.dp.PropertyMgr;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        //可以写到配置文件里
        String trafficName;
        Moveable traffic;
        //汽车 or 飞机 or 扫帚(只要在配置文件里写好要调用哪个Class方法，就可以定制任意交通工具，不需要改代码)
        //定制任意交通工具->继承Moveable
        trafficName = (String) PropertyMgr.get("trafficPlane");
        try {
            //把名字对应的类Load到内存，这个名字要用全路径
            //拿到确定的不带参数的构造方法getDeclaredConstructor，然后new一个对象newInstance
            traffic = (Moveable)Class.forName(trafficName).getDeclaredConstructor().newInstance();
            traffic.go();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //任意定制生产过程->用不同的生产工厂（Moveable XXXFactory.create())
        //产生的对象不用new，可以交给一个工厂方法
        //汽车工厂
        Moveable c = new CarFactory().create();
        c.go();
        //汽车
//        Moveable c = new Car();
//        c.go();
        //飞机
//        Moveable p = new Plane();
//        p.go();
        //扫帚
//        Moveable b = new Broom();
//        b.go();
    }
}
