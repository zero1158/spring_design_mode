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
 *@ClassName Single_06_double_check
 *@Description 懒汉式 - 双重检查 --- 重要,推荐使用
 *@Author zhutao
 *@Date 2021/9/7 19:15
 *@Version 1.0
 **/
public class Single_06_double_check {
    private Single_06_double_check(){}
    //使用volatile修饰
    private static volatile Single_06_double_check instance;
    public static Single_06_double_check getInstance(){
        if (instance == null){
            synchronized (Single_06_double_check.class){
                if (instance == null){
                    instance = new Single_06_double_check();
                }
            }
        }
        return instance;
    }
}
