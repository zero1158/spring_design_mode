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

import com.example.work.mode_02_factory.factory_01_simple.simple_factory.CheesePizza;
import com.example.work.mode_02_factory.factory_01_simple.simple_factory.GreekPizza;
import com.example.work.mode_02_factory.factory_01_simple.simple_factory.Pizza;

/**
 *@ClassName ChinaPizzaFactory
 *@Description 中国的pizza工厂
 *@Author zhutao
 *@Date 2021/9/10 15:51
 *@Version 1.0
 **/
public class ChinaPizzaFactory extends PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        //2.根据输入的名称,确定要下订单的Pizza的类型
        if (type.equals("china")) {
            pizza = new CheesePizza().setName("china");
        } else if (type.equals("china1")) {
            pizza = new GreekPizza().setName("china1");
        }
        System.out.println(type + " 开始制作 啦 --");
        return pizza;
    }
}
