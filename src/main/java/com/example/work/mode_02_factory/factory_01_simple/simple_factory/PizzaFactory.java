package com.example.work.mode_02_factory.factory_01_simple.simple_factory;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2021/9/9          zhutao                 1.0            Initial Version
 **/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName PizzaFactory
 * @Description Pizza工厂类 : 将不同的pizza生产线整合起来 --其实就是将判断要生产的pizza种类的方法抽离出来
 * @Author zhutao
 * @Date 2021/9/9 19:01
 * @Version 1.0
 **/
public class PizzaFactory {

    /**
     * 简单工厂模式 :
     */
    public Pizza pizzaFactory(String type) {
        Pizza pizza = null;
        //2.根据输入的名称,确定要下订单的Pizza的类型
        if (type.equals("cheese")) {
            pizza = new CheesePizza().setName("cheese");
        } else if (type.equals("greek")) {
            pizza = new GreekPizza().setName("greek");
        }
        System.out.println(type + " 被下订单啦 --");
        return pizza;
    }

    /**
     * 简单工厂模式 - 又叫静态工厂模式
     */
    public static Pizza pizzaFactory2(String type) {
        Pizza pizza = null;
        //2.根据输入的名称,确定要下订单的Pizza的类型
        if (type.equals("cheese")) {
            pizza = new CheesePizza().setName("cheese");
        } else if (type.equals("greek")) {
            pizza = new GreekPizza().setName("greek");
        }
        System.out.println(type + " 被下订单啦 --");
        return pizza;
    }

}
