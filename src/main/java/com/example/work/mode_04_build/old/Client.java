package com.example.work.mode_04_build.old;
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
 *@Description 客户端(测试)
 *@Author zhutao
 *@Date 2021/9/14 21:26
 *@Version 1.0
 **/
public class Client {
    /**
     * 缺点 : 把产品(房子)和创建产品的过程(即建房子的流程)封装在一起,耦合性太强
     * 解决 : 将产品和产品的建造过程解耦 -> 建造者模式
     */
    public static void main(String[] args) {
        OldCommonHouse commonHouse = new OldCommonHouse();
        commonHouse.build();
    }
}
