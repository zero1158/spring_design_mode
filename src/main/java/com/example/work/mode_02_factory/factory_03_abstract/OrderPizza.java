package com.example.work.mode_02_factory.factory_03_abstract;
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

import com.example.work.mode_02_factory.factory_03_abstract.factory.AbstrctFactory;
import com.example.work.mode_02_factory.factory_03_abstract.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *@ClassName OrderPizza
 *@Description 商店类
 *@Author zhutao
 *@Date 2021/9/10 16:50
 *@Version 1.0
 **/
public class OrderPizza {

    /**
     * 通过构造器注入(传递)依赖
     */
    private AbstrctFactory factory;
    public OrderPizza(AbstrctFactory factory){
        this.factory = factory;
    }

    public void salePizza(){
        do{
            String type = getType();
            Pizza pizza = this.factory.createFactory(type);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println(" --订购的pizza类型 没得哦 --");
                return;
            }
            System.out.println(type + " 可以开始售卖Pizza啦 ");
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
