package com.example.work.mode_04_build.build;
/**
 * Licensed to CMSR,Inc. under the terms of the CMSR
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date               Author               Version              Comments
 * 2021/9/14          zhutao                 1.0            Initial Version
 **/

/**
 *@ClassName BuildHouse
 *@Description 角色-抽象建造者 - 房屋抽象基类 :
 *@Author zhutao
 *@Date 2021/9/14 21:33
 *@Version 1.0
 **/
public abstract class BuildHouse {

    /**
     * 产品 必须要被组合到 抽象建造者中,这样才能返回给 指挥者
     * 要怎么给产品属性赋值呢 ?
     * 1.将产品放到具体建造者中,但是这样的话,就需要在每个具体建筑者中都放一个产品了,感觉也不好
     *
     */
    private House house = new House();

    /**
     * 打地基
     */
    public abstract void buildBase();

    /**
     * 建墙
     */
    public abstract void buildWall();

    /**
     * 封顶
     */
    public abstract void buildRoof();

    public House build(){
        System.out.println(" 房子建造好啦 ----- ");
        return house;
    }
}
