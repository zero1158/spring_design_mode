package com.example.work.mode_02_factory.factory_01_simple.simple_factory;
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

/**
 *@ClassName Test
 *@Description TODO
 *@Author zhutao
 *@Date 2021/9/10 11:04
 *@Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        OrderPizza pizza = new OrderPizza(factory);
    }
}
