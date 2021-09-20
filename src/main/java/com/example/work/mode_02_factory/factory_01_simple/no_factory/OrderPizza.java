package com.example.work.mode_02_factory.factory_01_simple.no_factory;
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
 *@Description 商店下单的类  -- 根据用户需求(我们输入的结果),向生产线订购pizza,并出售
 *@Author zhutao
 *@Date 2021/9/9 16:11
 *@Version 1.0
 **/
public class OrderPizza {

    /**
     * 这里直接在空参构造器中写下单的方法,当然也可以自定义一个方法来写,
     * 因为都是要创建该类对象的,直接在构造器中写就方便一点
     */
    public OrderPizza(){
        Pizza pizza;
        do{
            //1.获取需要的pizza类型
            String type = getType();
            //2.根据输入的名称,确定要下订单的Pizza的类型
            if (type.equals("cheese")){
                pizza = new CheesePizza().setName("cheese");
            }else if (type.equals("greek")){
                pizza = new GreekPizza().setName("greek");
            }else {
                break;
            }
            System.out.println(type + " 被下订单啦 --");
            //3.开始进入pizza生产的工序
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

            System.out.println(pizza.getName() + " -- 出售Pizza");
        }while (true);
    }

    public String getType(){
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
