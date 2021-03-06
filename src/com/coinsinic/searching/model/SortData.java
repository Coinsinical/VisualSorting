package com.coinsinic.searching.model;

import java.io.Serializable;

public class SortData implements Serializable,Cloneable {
    public  int[] arrays; //定义

    public  int completedIndex = 0; //已完成排序的数组下标
    public  int currentIndex = 0; //正在进行比较的数字下标
    public  int minIndex = 0; //目前最小数字下标

    public boolean isMove = true;

    public SortData(int n, int windowHeight) {
        this.arrays = new int[n];

        //生成随机数组
        for (int i = 0; i < n; i++) {
            arrays[i] = (int) (Math.random() * windowHeight + 1);
        }
    }
    public SortData(int[] arrays){
        this.arrays=arrays;
    }

    public void swap(int i, int j) {
        int tmp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = tmp;
    }

    //实现Clonable接口进行数据复制
    @Override
    public Object clone()  {
        SortData data = null;
        try {
            data = (SortData) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        data.arrays=this.arrays.clone();
        return data;
    }
}
