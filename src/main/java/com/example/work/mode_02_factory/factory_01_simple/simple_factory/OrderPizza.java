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
 *@ClassName OrderPizza
 *@Description 商店类(负责向不同的生产线订购不同的pizza , 这里开始直接向工厂订购)
 *@Author zhutao
 *@Date 2021/9/9 19:06
 *@Version 1.0
 **/
public class OrderPizza {

    /**
     * 这里其实就是把原来的方法合并到构造方法中去了,单独拆出来就是一个普通方法
     */
    public OrderPizza(PizzaFactory factory){
        do{
            //1.获取需要的pizza类型
            String type = getType();
            Pizza pizza = factory.pizzaFactory(type);
            if (pizza != null){
                System.out.println("--得到需要的Pizza种类 ---"+pizza.getName());
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                return;
            }
            System.out.println(pizza.getName() + " : --出售 Pizza---");
        }while (true);
    }

    /**
     * 验证静态工厂模式 :
     */
    public void getPizza(){
        do{
            //1.获取需要的pizza类型
            String type = getType();
            Pizza pizza = PizzaFactory.pizzaFactory2(type);
            if (pizza != null){
                System.out.println("静态工厂模式 --得到需要的Pizza种类 ---"+pizza.getName());
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                return;
            }
            System.out.println(pizza.getName() + " : 静态工厂模式 --出售 Pizza---");
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
