package com.example.work.mode_01_singleton;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2021/9/7          zhutao                 1.0            Initial Version
 **/

/**
 *@ClassName Single_03_unsafe
 *@Description 懒汉式 - 线程不安全
 *@Author zhutao
 *@Date 2021/9/7 18:34
 *@Version 1.0
 **/
public class Single_03_unsafe {
    /**
     * 优点 : 做到了懒加载,不回浪费内存
     * 缺点 : 在多线程下,在一个线程进入了if判断还未创建实例时,另一个线程也进入了if判断
     *        就会导致多个实例被创建
     */
    private Single_03_unsafe(){}
    private static Single_03_unsafe instance;
    public static Single_03_unsafe getInstance(){
        if (instance == null){
            instance = new Single_03_unsafe();
        }
        return instance;
    }
}
