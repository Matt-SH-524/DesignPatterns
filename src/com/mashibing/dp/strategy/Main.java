package com.mashibing.dp.strategy;

import java.util.Arrays;

public class Main {
    //建立main方法的快捷方式-psvm
    public static void main(String[] args) {
        //int数组
//        int[] a = {9,2,3,5,7,1,4} ;
        //Cat,Dog 数组
        Cat[] catArray = {new Cat(5,1),new Cat(2,4),new Cat(3,6),new Cat(7,2)};
        Dog[] dogArray = {new Dog(7),new Dog(5),new Dog(6),new Dog(15),new Dog(0)};

        //排序类Dog
        Sorter<Dog> sorter = new Sorter<>();
        //排序类中的排序方法Dog
        sorter.sort(dogArray,new DogComparator());
        //整数数组变成字符串数组，打印出来Dog
        System.out.println(Arrays.toString(dogArray));

        //排序类Cat的height
        Sorter<Cat> sorterCat = new Sorter<>();
        //排序类中的排序方法Cat的height
        sorterCat.sort(catArray,new CatHeightComparator());
        //整数数组变成字符串数组，打印出来Cat的height
        System.out.println(Arrays.toString(catArray));

        //排序类中的排序方法Cat的weight
        sorterCat.sort(catArray,new CatWeightComparator());
        //整数数组变成字符串数组，打印出来Cat的weight
        System.out.println(Arrays.toString(catArray));

        //排序类中的排序方法Cat的weight->因为CatWeightComparator接口里面只有一个方法->被称为FunctionalInterface，所以可以用land表达式替换
        sorterCat.sort(catArray,(o1,o2)->{
            if(o1.weight< o2.weight) return -1;
            else if(o1.weight>o2.weight) return 1;
            return 0;
        });
        //整数数组变成字符串数组，打印出来Cat的weight
        System.out.println(Arrays.toString(catArray));

    }
}
