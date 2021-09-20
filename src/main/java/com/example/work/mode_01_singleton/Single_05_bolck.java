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
 *@ClassName Single_05_bolck
 *@Description 懒汉式 - 同步代码块
 *@Author zhutao
 *@Date 2021/9/7 19:10
 *@Version 1.0
 **/
public class Single_05_bolck {
    private Single_05_bolck (){}
    private static Single_05_bolck instance;
    public static Single_05_bolck getInstance(){
        if (instance == null){
            /**
             * 在if方法里面加sync不仅无法解决效率问题,还导致线程问题
             */
            synchronized (Single_05_bolck.class){
                instance = new Single_05_bolck();
            }
        }
        return instance;
    }
}
