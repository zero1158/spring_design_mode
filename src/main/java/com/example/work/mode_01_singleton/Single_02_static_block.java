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
 *@ClassName Single_02_static_block
 *@Description 饿汉式 - 静态代码块 : 跟静态常量的差不多,就是写的方式不同
 *@Author zhutao
 *@Date 2021/9/7 18:17
 *@Version 1.0
 **/
public class Single_02_static_block {
}
class Singleton_02{
    private Singleton_02(){}
    private static Singleton_02 instance;
    static {
        //在静态代码块种创建单例对象 - 也是在类装载的时候执行静态代码块种的内容
        instance = new Singleton_02();
    }
    public static Singleton_02 getInstance(){
        return instance;
    }
}