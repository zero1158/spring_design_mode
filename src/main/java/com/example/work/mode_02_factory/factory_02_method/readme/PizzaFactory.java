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

import com.example.work.mode_02_factory.factory_01_simple.simple_factory.Pizza;

/**
 *@ClassName PizzaFactory
 *@Description 工厂类的基类
 *@Author zhutao
 *@Date 2021/9/10 15:50
 *@Version 1.0
 **/
public abstract class PizzaFactory {
    /**
     * 由各个工厂子类实现,创建不同的pizza
     */
    public abstract Pizza createPizza(String type);

    public void getPizza(String type){
        Pizza pizza = createPizza(type);
        if (pizza != null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            System.out.println(type + " : Pizza生产完成啦 !");
        }else {
            System.out.println("---没见过的Pizza,没办法生产---");
            return;
        }
    }
}
