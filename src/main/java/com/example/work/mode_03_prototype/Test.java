package com.example.work.mode_03_prototype;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2021/9/12          zhutao                 1.0            Initial Version
 **/

/**
 *@ClassName Test
 *@Description 原型模式
 *@Author zhutao
 *@Date 2021/9/12 12:55
 *@Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("小明", "3", "红色",new Cow("小红","2"));
        /**
         * 测试原型模式 : 浅拷贝
         */
        Sheep sheep1 = sheep.shallowClone();
        Sheep sheep2 = sheep.shallowClone();
        Sheep sheep3 = sheep.shallowClone();
        System.out.println("sheep  : "+sheep.hashCode() +" --> "+sheep);
        System.out.println(sheep == sheep1); //false:表示实际每个sheep都指向了不同的地址
        System.out.println("sheep1 : "+sheep1.hashCode() +" --> "+sheep1);
        System.out.println("sheep2 : "+sheep2.hashCode() +" --> "+sheep2);
        System.out.println("sheep3 : "+sheep3.hashCode() +" --> "+sheep3);

        Sheep deelSheep = new Sheep("小刚", "2", "黑色",new Cow("小花","3"));
    }
}
