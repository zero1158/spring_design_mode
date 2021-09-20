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

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *@ClassName Pizza
 *@Description Pizza的基类
 *@Author zhutao
 *@Date 2021/9/9 18:36
 *@Version 1.0
 **/
@Data
@Accessors(chain = true)
public abstract class Pizza{
    private String name;

    /**
     * 抽象方法:不同的pizza有各自的独特行为
     */
    public abstract void prepare();

    /**
     * 不同的pizza这些行为也差不多,直接在基类中定义实现
     */
    public void bake(){
        System.out.println(name + " : 烘烤Pizza-----");
    }
    public void cut(){
        System.out.println(name + " : 分割Pizza-----");
    }
    public void box(){
        System.out.println(name + " : 打包Pizza-----");
    }
}
