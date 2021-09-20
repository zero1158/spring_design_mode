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

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *@ClassName Pizza
 *@Description 抽象Pizza基类
 *@Author zhutao
 *@Date 2021/9/9 15:49
 *@Version 1.0
 **/
@Data
@Accessors(chain = true)
public abstract class Pizza {
    //Pizza名称
    private String name;
    /**
     * 准备材料的方法 :
     * 不同的Pizza需要准备的材料不同,所有将准备材料的方法抽象,有子类具体定义实际操作
     */
    public abstract void prepare();

    /**
     * 烘烤Pizza的方法 : bake()和下面的切割cut(),包装box()是每个pizza都要做,且工序都是一样的,所以在基类种定义具体操作
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
