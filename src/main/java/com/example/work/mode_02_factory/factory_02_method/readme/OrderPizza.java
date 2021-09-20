package com.example.work.mode_02_factory.factory_02_method.readme;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2021/9/10          zhutao                 1.0            Initial Version
 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *@ClassName OrderPizza
 *@Description 商店类
 *@Author zhutao
 *@Date 2021/9/10 16:05
 *@Version 1.0
 **/
public class OrderPizza {

    public OrderPizza(PizzaFactory factory){
        do{
            String type = getType();
            factory.getPizza(type);
            System.out.println(type + " 类型的pizza 可以出售 啦 !!");
        }while (true);
    }

    public String getType() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" 请输入Pizza的类型 : ");
        try {
            String readLine = reader.readLine();
            return readLine;
        } catch (IOException e) {
            e.printStackTrace();
            return "输入类型异常";
        }
    }
}
