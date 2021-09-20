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
 *@ClassName Single_07_static_inner
 *@Description 静态内部类的方式 : 使用了JVM底层的类装载机制,保证了类的线程安全 -- 推荐使用
 *@Author zhutao
 *@Date 2021/9/7 19:19
 *@Version 1.0
 **/
public class Single_07_static_inner {
    private Single_07_static_inner(){}

    /**
     * 定义一个内部类
     */
    private static class Singleton_07{
        private final static Single_07_static_inner INSTANCE = new Single_07_static_inner();
    }
    /**
     * 外部类被装载的时候,静态内部类还不会被装载(保证了懒加载),当调用方法,用到了静态变量的时候,
     * 静态内部类才会被装载,类在被装载的时候是线程安全的,且只会被装载一次
     */
    public static Single_07_static_inner getInstance(){
        return Singleton_07.INSTANCE;
    }
}
