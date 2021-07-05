package com.mashibing.dp.strategy;

public class Cat implements Comparable<Cat>{
    int weight,height;

    //class的构造体
    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    //比较函数->猫比较大小的策略想灵活指定
    //设计原则：对修改关闭，对扩展开放，开闭原则。
    public int compareTo(Cat c) {
        //大于传入参数的场合返回1
        if (this.weight > c.weight) return 1;
        //小于传入参数的场合返回-1
        else if (this.weight < c.weight) return -1;
        //等于传入参数的场合返回0
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

}
