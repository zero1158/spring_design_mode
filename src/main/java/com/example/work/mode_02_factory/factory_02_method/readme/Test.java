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

/**
 *@ClassName Test
 *@Description TODO
 *@Author zhutao
 *@Date 2021/9/10 16:21
 *@Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        /**
         * 当需要中国工厂的pizza时,就new一个中国工厂,需要外国的工厂,就new外国的工厂
         * 当然这里也可以加一层判断 : 可以根据地址判断需要哪里的工厂,在自动去new
         */
        ChinaPizzaFactory chinaPizza = new ChinaPizzaFactory();
        new OrderPizza(chinaPizza);

    }
}
