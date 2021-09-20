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
 *@ClassName Single_04_safe
 *@Description 懒汉式 - 通过sync达到线程安全
 *@Author zhutao
 *@Date 2021/9/7 19:03
 *@Version 1.0
 **/
public class Single_04_safe {
    private Single_04_safe(){}
    private static Single_04_safe instance;

    /**
     * 优点 : 解决了线程不安全问题
     * 缺点 : 效率太低,每个线程在想获得类的实例的时候,都要先进行同步,在判断是否需要实例化,
     *        但实际上只需执行一次实例化代码就够了,后面想获得实例,直接return即可,方法进行同步效率太低
     * @return
     */
    public static synchronized Single_04_safe getInstance(){
        if (instance == null){
            instance = new Single_04_safe();
        }
        return instance;
    }
}
