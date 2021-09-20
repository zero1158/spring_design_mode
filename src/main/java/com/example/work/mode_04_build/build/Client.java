package com.example.work.mode_04_build.build;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2021/9/14          zhutao                 1.0            Initial Version
 **/

/**
 *@ClassName Client
 *@Description TODO
 *@Author zhutao
 *@Date 2021/9/14 22:17
 *@Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        /**
         * 要建造什么样的房子 ,就传入什么样的具体建造者
         */
        BuildDirector director = new BuildDirector(new CommonHouse());
        House house = director.getHouse();
    }
}
