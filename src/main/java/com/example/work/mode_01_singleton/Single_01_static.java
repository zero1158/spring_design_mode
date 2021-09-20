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
 *@ClassName Single_01_static
 *@Description 饿汉式 - 静态常量 : 不推荐使用,会造成内存浪费
 *@Author zhutao
 *@Date 2021/9/7 18:01
 *@Version 1.0
 **/
public class Single_01_static {
    public static void main(String[] args) {
        /**
         * 优点 : 在类加载的时候就完成了实例化,避免了线程安全问题
         * 缺点 : 在类装载的时候就完成了实例化,但是若是用不到该类,就会造成内存浪费
         */
        Singleton_01 instance_a = Singleton_01.getInstance();
        Singleton_01 instance_b = Singleton_01.getInstance();
        System.out.println(instance_a==instance_b);
    }
}
class Singleton_01{
    //1.私有化构造器
    private Singleton_01(){};
    //2.创建静态常量
    private final static Singleton_01 instance = new Singleton_01();
    //3.暴露静态方法给外界调用获取实例
    public static Singleton_01 getInstance(){
        return instance;
    }
}
