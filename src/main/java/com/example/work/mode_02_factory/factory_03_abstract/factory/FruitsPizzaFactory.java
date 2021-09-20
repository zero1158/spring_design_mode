package com.example.work.mode_02_factory.factory_03_abstract.factory;
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

import com.example.work.mode_02_factory.factory_03_abstract.pizza.CheesePizza;
import com.example.work.mode_02_factory.factory_03_abstract.pizza.GreekPizza;
import com.example.work.mode_02_factory.factory_03_abstract.pizza.Pizza;

/**
 *@ClassName FruitsPizzaFactory
 *@Description 水果Pizza工厂
 *@Author zhutao
 *@Date 2021/9/10 16:53
 *@Version 1.0
 **/
public class FruitsPizzaFactory implements AbstrctFactory{
    @Override
    public Pizza createFactory(String type) {
        Pizza pizza = null;
        //2.根据输入的名称,确定要下订单的Pizza的类型
        if (type.equals("apple")) {
            pizza = new CheesePizza().setName("apple");
        } else if (type.equals("banana")) {
            pizza = new GreekPizza().setName("banana");
        }
        System.out.println(type + " 开始制作 啦 --");
        return pizza;
    }
}
