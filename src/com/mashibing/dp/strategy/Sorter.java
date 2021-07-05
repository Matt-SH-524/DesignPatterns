package com.mashibing.dp.strategy;

public class Sorter<T>{

    //Comparator<T>：传入一个T类型的比较器,除了传进一个数组之外，还传了排序策略过来。
    public void sort(T[] arr,Comparator<T> comparator) {
        //选择排序的算法
        for(int i=0;i<arr.length-1;i++) {
            //最小位
            int minPos = i;
            for(int j=i+1;j<arr.length;j++) {
                //if a>b a,b换位
                minPos = comparator.compare(arr[j],(arr[minPos]))==-1 ? j : minPos;
            }
            swap(arr,i,minPos);
        }
    }
    //a,b换位方法
    //T类型不能用static
    void swap(T[] arr,int i,int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
